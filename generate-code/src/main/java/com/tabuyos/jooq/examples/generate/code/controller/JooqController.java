package com.tabuyos.jooq.examples.generate.code.controller;

import com.tabuyos.jooq.examples.generate.code.model.tables.User;
import org.jooq.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import static com.tabuyos.jooq.examples.generate.code.model.Tables.*;
import static org.jooq.impl.DSL.countDistinct;

/**
 * @author tabuyos
 */
@Component
public class JooqController {
  private final DSLContext create;

  public JooqController(DSLContext create) {
    this.create = create;
  }

  public void init() {
    User user = USER.as("u");
    Result<Record1<String>> fetch = create.select(user.NAME).from(user).fetch();
    SelectJoinStep<Record> from = create.select().from(USER);
    System.out.println(from.getSQL());
  }
}
