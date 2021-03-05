/*
 * Copyright 2019-2021 the langrundata.
 */
package com.tabuyos.jooq.examples.generate.code.application;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * Description:
 *
 * <pre>
 *   <b>project: </b>jooq-examples
 *   <b>package: </b>com.tabuyos.jooq.examples.generate.code.application
 *   <b>class: </b>GenerateCodeApplication
 *   comment here.
 * </pre>
 *
 * @author <pre><b>username: </b><a href="http://www.tabuyos.com">Tabuyos</a></pre>
 * <pre><b>site: </b><a href="http://www.tabuyos.com">http://www.tabuyos.com</a></pre>
 * <pre><b>email: </b>tabuyos@outlook.com</pre>
 * <pre><b>description: </b>
 *       <pre>
 *         Talk is cheap, show me the code.
 *       </pre>
 *     </pre>
 * @version 0.1.0
 * @since 0.1.0 - 3/5/21 4:34 PM
 */
@SpringBootApplication(scanBasePackages = {"com.tabuyos.jooq.examples.generate.code"})
public class GenerateCodeApplication {
  public static void main(String[] args) {
    SpringApplication.run(GenerateCodeApplication.class, args);
  }
}
