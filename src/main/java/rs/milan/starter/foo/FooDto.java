package rs.milan.starter.foo;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class FooDto {

    private String name;

    private boolean isFoo;
}
