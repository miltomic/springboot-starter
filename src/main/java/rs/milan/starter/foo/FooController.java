package rs.milan.starter.foo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
public class FooController {

    @GetMapping(path = "/foos")
    public List<FooDto> getFoos() {
        return Arrays.asList(new FooDto("A foo", true));
    }
}
