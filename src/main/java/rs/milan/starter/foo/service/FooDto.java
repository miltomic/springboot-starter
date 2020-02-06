package rs.milan.starter.foo.service;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Schema(name = "Foo", description = "Foo model")
public class FooDto {

    @Schema(description = "Name of the foo")
    @JsonProperty("name")
    private String name;

    @Schema(description = "Indicates whether it's really a Foo")
    @JsonProperty("is_foo")
    private boolean isFoo;
}
