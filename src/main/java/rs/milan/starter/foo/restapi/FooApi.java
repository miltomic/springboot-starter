package rs.milan.starter.foo.restapi;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import rs.milan.starter.foo.service.FooDto;
import rs.milan.starter.foo.service.FooService;

import java.util.List;

/**
 * You may also check out Spring REST docs
 * <a href="https://spring.io/projects/spring-restdocs">https://spring.io/projects/spring-restdocs</a>,
 * a convenient way to generate human-readable documentation besides Swagger
 *
 * NOTE: Controller sends back in response the DTO it received from the service.
 * This is not a 'clean' as we would have to create a separate FooResponse class in order to stay loosely-coupled.
 * Reason why I followed above-mentioned approach is because we will avoid having bunch of duplicate classes (DTO and response counterparts)
 * When situation demands to have a separately defined response class we can easily introduce it, e.g. one API endpoint combing multiple service responses.
 */

@Tag(name = "foo", description = "The Foo API")
@RestController
@AllArgsConstructor
@RequestMapping("/foos")
public class FooApi {

    private final FooService fooService;

    @Operation(summary = "List all foos", description = "Lists all available foos")
    @GetMapping()
    public List<FooDto> getFoos() {
        return fooService.fetchAllFoos();
    }
}
