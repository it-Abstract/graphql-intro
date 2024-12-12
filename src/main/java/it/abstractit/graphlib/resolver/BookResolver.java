package it.abstractit.graphlib.resolver;

import it.abstractit.graphlib.business.AuthorService;
import it.abstractit.graphlib.business.BookService;
import it.abstractit.graphlib.business.GenderService;
import it.abstractit.graphlib.business.ReviewService;
import it.abstractit.graphlib.model.graphql.types.Author;
import it.abstractit.graphlib.model.graphql.types.Book;
import it.abstractit.graphlib.model.graphql.types.Gender;
import it.abstractit.graphlib.model.graphql.types.Review;
import lombok.AllArgsConstructor;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.graphql.data.method.annotation.Argument;
import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.graphql.data.method.annotation.SchemaMapping;
import org.springframework.stereotype.Controller;

import java.util.List;

@Controller
@AllArgsConstructor
public class BookResolver {
    protected final Logger logger = LoggerFactory.getLogger(getClass());

    private final BookService bookService;
    private final AuthorService authorService;
    private final ReviewService reviewService;
    private final GenderService genderService;

    @QueryMapping
    public List<Book> books() {
        return bookService.resolveAll();
    }

    @QueryMapping
    public Book book(@Argument Long id) {
        return bookService.resolveById(id);
    }

    @SchemaMapping(typeName = "Book", field = "authors")
    public List<Author> authors(Book book) {
        logger.info("Resolving authors for book {}", book.getId());
        return authorService.resolveAuthorsByBook(Long.valueOf(book.getId()));
    }

    @SchemaMapping(typeName = "Book", field = "reviews")
    public List<Review> reviews(Book book) {
        logger.info("Resolving reviews for book {}", book.getId());
        return reviewService.resolveByBookId(Long.valueOf(book.getId()));
    }

    @SchemaMapping(typeName = "Book", field = "gender")
    public Gender gender(Book book) {
        logger.info("Resolving gender for book {}", book.getId());
        return genderService.resolveById(Long.valueOf(book.getId()));
    }

}