package example.generate.code.dao;

import org.jooq.*;
import org.jooq.impl.DSL;

import java.util.List;
import java.util.Map;

public class PageUtil {

  public static <O> PageResult<O> execute(ResultQuery<? extends Record> query, DSLContext create, Class<O> clazz) {
    return execute(query, create, r -> r.into(clazz));
  }

  public static <O> PageResult<O> execute(
      ResultQuery<? extends Record> query,
      DSLContext create,
      RecordMapper<? super Record, O> mapper) {
    DSLContext using = DSL.using(query.configuration());
    Map<String, Param<?>> params = query.getParams();
    List<Object> bindValues = query.getBindValues();
    System.out.println(bindValues);
    System.out.println(params);
    String sql = query.getSQL();
    System.out.println(sql);
    List<O> into = using.fetch(sql, bindValues.toArray()).map(mapper);
    System.out.println(
        create.fetch("select * from public.user;"));
    //System.out.println(create.fetch("select found_rows();"));
    System.out.println(into);
    PageResult<O> pageResult = new PageResult<>();
    pageResult.setData(into);
    return pageResult;
  }
}
