package com.tabuyos.jooq.examples.generate.code.controller;

import com.tabuyos.jooq.examples.generate.code.dao.UserDaoImpl;
import org.springframework.stereotype.Component;

@Component
public class JooqController {

  private final UserDaoImpl userDao;

  public JooqController(UserDaoImpl userDao) {
    this.userDao = userDao;
  }

  public void init() {
    userDao.tabuyos();
  }
}
