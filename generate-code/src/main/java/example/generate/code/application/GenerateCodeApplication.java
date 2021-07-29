/*
 * Copyright 2019-2021 the langrundata.
 */
package example.generate.code.application;

import example.generate.code.config.GenerateCodeConfig;
import example.generate.code.controller.JooqController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication(scanBasePackages = {"example.generate.code"})
public class GenerateCodeApplication {
  public static void main(String[] args) throws Exception {
    ConfigurableApplicationContext context = SpringApplication.run(GenerateCodeApplication.class, args);
    System.out.println("==================================================================================================");
    GenerateCodeConfig.init();
    context.getBean(JooqController.class).init();
  }
}
