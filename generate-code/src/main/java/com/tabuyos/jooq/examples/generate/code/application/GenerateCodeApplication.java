/*
 * Copyright 2019-2021 the langrundata.
 */
package com.tabuyos.jooq.examples.generate.code.application;

import com.tabuyos.jooq.examples.generate.code.config.GenerateCodeConfig;
import com.tabuyos.jooq.examples.generate.code.controller.JooqController;
import org.jooq.DSLContext;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication(scanBasePackages = {"com.tabuyos.jooq.examples.generate.code"})
public class GenerateCodeApplication {
  public static void main(String[] args) throws Exception {
    ConfigurableApplicationContext context = SpringApplication.run(GenerateCodeApplication.class, args);
    System.out.println("==================================================================================================");
    GenerateCodeConfig.init();
    context.getBean(JooqController.class).init();
  }
}
