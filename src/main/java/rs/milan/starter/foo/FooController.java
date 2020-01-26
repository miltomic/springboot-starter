package rs.milan.starter.foo;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

/**
 *
 * You may also check out Spring REST docs
 * <a href="https://spring.io/projects/spring-restdocs">https://spring.io/projects/spring-restdocs</a>,
 * a convenient way to generate human-readable documentation besides Swagger
 */

@Tag(name = "foo", description = "The Foo API")
@RestController
@RequestMapping("/foos")
public class FooController {

    @Operation(summary = "List all foos", description = "Lists all available foos")
    @GetMapping()
    public List<FooDto> getFoos() {
        return Arrays.asList(new FooDto("A foo", true));
    }
}
