package com.tabuyos.jooq.examples.generate.code.dao;

import static com.tabuyos.jooq.examples.generate.code.model.Tables.*;
import com.tabuyos.jooq.examples.generate.code.model.tables.daos.UserDao;
import com.tabuyos.jooq.examples.generate.code.model.tables.pojos.User;
import com.tabuyos.jooq.examples.generate.code.model.tables.records.UserRecord;
import org.jooq.Configuration;
import org.jooq.DSLContext;
import org.jooq.SelectConditionStep;
import org.jooq.SelectWhereStep;
import org.springframework.stereotype.Repository;

/**
 * @author tabuyos
 */
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
    System.out.println(create.execute("select * from user;"));
    System.out.println(create.fetch("select * from user;"));
    SelectConditionStep<UserRecord> where = create.selectFrom(USER).where(USER.AGE.eq(25));
    System.out.println(where.fetch());
    System.out.println("---------------------------------");
    PageResult<User> execute = PageUtil.execute(where, create, User.class);
    System.out.println(execute);
  }
}
