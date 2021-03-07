package com.tabuyos.jooq.examples.generate.code.config;

import org.jooq.codegen.GenerationTool;
import org.jooq.meta.jaxb.*;

import java.nio.charset.StandardCharsets;

/** @author tabuyos */
public class GenerateCodeConfig {

  public static void init() throws Exception {
    GenerationTool.generate(
        new Configuration()
            .withLogging(Logging.WARN)
            .withOnError(OnError.LOG)
            .withJdbc(
                new Jdbc()
                    .withDriver("org.mariadb.jdbc.Driver")
                    .withUrl(
                        "jdbc:mariadb://localhost:3306/tabuyos?useUnicode=true&characterEncoding=utf8")
                    .withUser("tabuyos")
                    .withPassword("tabuyos"))
            .withGenerator(
                new Generator()
                    .withDatabase(
                        new Database()
                            .withName("org.jooq.meta.mariadb.MariaDBDatabase")
                            .withInputSchema("tabuyos")
                            .withIncludes(".*"))
                    .withGenerate(
                        new Generate()
                            .withGeneratedSerialVersionUID(GeneratedSerialVersionUID.HASH)
                            .withPojos(true)
                            .withDaos(true)
                            .withInterfaces(true)
                            .withJpaAnnotations(true)
                            .withSpringAnnotations(true))
                    .withTarget(
                        new Target()
                            .withPackageName("com.tabuyos.jooq.examples.generate.code.model")
                            .withDirectory("generate-code/src/main/java")
                            .withEncoding(StandardCharsets.UTF_8.name()))));
  }
}
