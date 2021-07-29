package example.generate.code.controller;

import example.generate.code.dao.UserDaoImpl;
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
