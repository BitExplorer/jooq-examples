package example.generate.code.config;

import org.jooq.codegen.GenerationTool;
import org.jooq.meta.jaxb.*;

import java.nio.charset.StandardCharsets;

public class GenerateCodeConfig {

  public static void init() throws Exception {
    GenerationTool.generate(
        new Configuration()
            .withLogging(Logging.WARN)
            .withOnError(OnError.LOG)
            .withJdbc(
                new Jdbc()
                    .withDriver("org.postgresql.Driver")
                    .withUrl(
                        "jdbc:postgresql://localhost:5432/finance_test_db")
                    .withUser("henninb")
                    .withPassword("monday1"))
            .withGenerator(
                new Generator()
                    .withDatabase(
                        new Database()
                            .withName("org.jooq.meta.postgres.PostgresDatabase")
                            .withInputSchema("public")
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
                            .withPackageName("example.generate.code.model")
                            .withDirectory("generate-code/src/main/java")
                            .withEncoding(StandardCharsets.UTF_8.name()))));
  }
}
