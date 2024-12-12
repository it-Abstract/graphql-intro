package it.abstractit.graphlib.business;

import it.abstractit.graphlib.model.dto.AuthorDto;
import it.abstractit.graphlib.model.graphql.types.Author;
import it.abstractit.graphlib.model.mapper.LibraryMapper;
import it.abstractit.graphlib.repository.AuthorRepository;
import lombok.AllArgsConstructor;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class AuthorService {
    protected final Logger logger = LoggerFactory.getLogger(getClass());

    private final AuthorRepository authorRepository;
    private final LibraryMapper libraryMapper;

    public Author resolveAuthorById(Long id) {
        logger.info("Query author by id: {}", id);
        return authorRepository.findById(id).map(libraryMapper::authorToAuthorGraphQl).orElseThrow();
    }

    public List<AuthorDto> findAuthorsByBook(Long bookId) {
        return authorRepository
                .findAuthorsByBooksId(bookId)
                .stream()
                .map(libraryMapper::authorToAuthorDto)
                .toList();
    }

    public List<Author> resolveAuthorsByBook(Long bookId) {
        return authorRepository
                .findAuthorsByBooksId(bookId)
                .stream()
                .map(libraryMapper::authorToAuthorGraphQl)
                .toList();
    }
}
