package rs.milan.starter.foo;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.modelmapper.ModelMapper;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import rs.milan.starter.foo.datastore.FooRepository;

import java.util.List;
import java.util.stream.Collectors;

/**
 * You may also check out Spring REST docs
 * <a href="https://spring.io/projects/spring-restdocs">https://spring.io/projects/spring-restdocs</a>,
 * a convenient way to generate human-readable documentation besides Swagger
 */

@Tag(name = "foo", description = "The Foo API")
@RestController
@RequestMapping("/foos")
public class FooController {

    private final FooRepository fooRepository;
    private final ModelMapper mapper;

    public FooController(FooRepository fooRepository, ModelMapper modelMapper) {
        this.fooRepository = fooRepository;
        this.mapper = modelMapper;
    }

    @Operation(summary = "List all foos", description = "Lists all available foos")
    @GetMapping()
    public List<FooDto> getFoos() {
        return fooRepository.findAll().stream()
                .map(entity -> mapper.map(entity, FooDto.class))
                .collect(Collectors.toList());
    }
}
