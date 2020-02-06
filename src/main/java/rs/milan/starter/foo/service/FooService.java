package rs.milan.starter.foo.service;

import lombok.AllArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;
import rs.milan.starter.foo.datastore.FooRepository;

import java.util.List;
import java.util.stream.Collectors;

@Service
@AllArgsConstructor
public class FooService {

    private final FooRepository fooRepository;
    private final ModelMapper mapper;

    public List<FooDto> fetchAllFoos() {
        return fooRepository.findAll().stream()
                .map(entity -> mapper.map(entity, FooDto.class))
                .collect(Collectors.toList());
    }

}
