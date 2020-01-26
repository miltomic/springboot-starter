package rs.milan.starter.configuration;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Info;
import org.springframework.context.annotation.Configuration;

/**
 * Basic configuration for enabling Swagger OpenAPI documentation that can be checked on
 * <a href="http://localhost:8080/starter/swagger-ui.html">http://localhost:8080/starter/swagger-ui.html</a> and
 * <a href="http://localhost:8080/starter/v3/api-docs">http://localhost:8080/starter/v3/api-docs</a>
 *
 * You may also check out Spring REST docs
 *  * <a href="https://spring.io/projects/spring-restdocs">https://spring.io/projects/spring-restdocs</a>,
 *  * a convenient way to generate human-readable documentation besides Swagger
 */
@OpenAPIDefinition(
        info = @Info(
                title = "SpringBoot Starter Service",
                description = "Boilerplate code for a new SpringBoot Service"
        )
)
@Configuration
public class SwaggerOpenAPI {
}
