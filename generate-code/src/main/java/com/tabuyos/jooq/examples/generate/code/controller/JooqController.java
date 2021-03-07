package com.tabuyos.jooq.examples.generate.code.controller;

import com.tabuyos.jooq.examples.generate.code.model.tables.User;
import com.tabuyos.jooq.examples.generate.code.model.tables.daos.UserDao;
import com.tabuyos.jooq.examples.generate.code.model.tables.records.UserRecord;
import org.jooq.*;
import org.jooq.impl.DSL;
import org.springframework.stereotype.Component;

import static com.tabuyos.jooq.examples.generate.code.model.Tables.*;
import static org.jooq.impl.DSL.countDistinct;

/**
 * @author tabuyos
 */
@Component
public class JooqController {
  private final DSLContext create;
  private final UserDao userDao;

  public JooqController(DSLContext create, UserDao userDao) {
    this.create = create;
    this.userDao = userDao;
  }

  public void init() {
    Result<UserRecord> fetch = create.selectFrom(USER).fetch();
    UserRecord userRecord = create.selectFrom(USER).fetchAny();
    Result<Record> fetch1 = create.select().from(USER).fetch();
    Record record = create.select().from(USER).fetchAny();
    assert record != null;
    String name = record.get(USER.NAME, String.class);
    create.select().from(USER).fetch();
    Result<Record> fetch2 = create.select().from(USER).fetch();
    ((UserRecord) fetch2).getId();
    User c = new User();
    create.insertInto(c).values().execute();
    userDao.update();
    userDao.delete();
    userDao.insert();
    userDao.findById(1);
    userDao.findAll();
  }
}
