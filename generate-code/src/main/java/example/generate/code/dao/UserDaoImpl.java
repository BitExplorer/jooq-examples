package example.generate.code.dao;

import static example.generate.code.model.Tables.*;
import example.generate.code.model.tables.daos.UserDao;
import example.generate.code.model.tables.pojos.User;
import example.generate.code.model.tables.records.UserRecord;
import org.jooq.Configuration;
import org.jooq.DSLContext;
import org.jooq.SelectConditionStep;
import org.springframework.stereotype.Repository;


@Repository
public class UserDaoImpl extends UserDao {

  private final DSLContext create;

  public UserDaoImpl(Configuration configuration, DSLContext create) {
    super(configuration);
    this.create = create;
  }

  public void tabuyos() {
    System.out.println(create.selectFrom(USER).fetchAny());
    System.out.println(create.selectFrom("user").fetch());
    System.out.println(create.execute("select * from public.user;"));
    System.out.println(create.fetch("select * from public.user;"));
    SelectConditionStep<UserRecord> where = create.selectFrom(USER).where(USER.AGE.eq(25));
    System.out.println(where.fetch());
    System.out.println("---------------------------------");
    PageResult<User> execute = PageUtil.execute(where, create, User.class);
    System.out.println(execute);
  }
}
