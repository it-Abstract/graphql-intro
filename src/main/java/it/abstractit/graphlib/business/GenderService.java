package it.abstractit.graphlib.business;

import it.abstractit.graphlib.model.graphql.types.Gender;
import it.abstractit.graphlib.model.mapper.LibraryMapper;
import it.abstractit.graphlib.repository.GenderRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class GenderService {

    private final GenderRepository genderRepository;
    private final LibraryMapper libraryMapper;

    public Gender resolveById(Long id) {
        return genderRepository.findByBooks_Id(id).map(libraryMapper::genderToGenderGraphQl).orElse(null);
    }
}
