package it.abstractit.graphlib.rest;

import it.abstractit.graphlib.business.AuthorService;
import it.abstractit.graphlib.business.BookService;
import it.abstractit.graphlib.business.ReviewService;
import it.abstractit.graphlib.model.dto.*;
import it.abstractit.graphlib.model.entity.BookEntity;
import it.abstractit.graphlib.model.mapper.LibraryMapper;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/books")
@AllArgsConstructor
public class BookRestController {

    private final BookService bookService;
    private final ReviewService reviewService;
    private final AuthorService authorService;
    private final LibraryMapper libraryMapper;

    @GetMapping
    public List<BookUnderFetchDto> getAllBooks() {
        return bookService.findAll();
    }

    @PostMapping
    public BookUnderFetchDto createBook(@RequestBody BookEntity book) {
        return libraryMapper
                .bookToBookDto(bookService.save(book));
    }

    @GetMapping("/{id}")
    public BookUnderFetchDto getBookById(@PathVariable Long id) {
        return bookService.findById(id);
    }

    @GetMapping("/{id}/complete")
    public BookOverFetchDto getBookByIdOverFetch(@PathVariable Long id) {
        return bookService.findByIdOverfetch(id);
    }

    @PutMapping("/{id}")
    public BookUnderFetchDto editBook(@RequestBody BookEntity book) {
        return libraryMapper.bookToBookDto(bookService.updateBook(book));
    }

    @DeleteMapping("/{id}")
    public void deleteBook(@PathVariable Long id) {
        bookService.deleteById(id);
    }

    @GetMapping("/{id}/reviews")
    public List<ReviewDto> getBookReviews(@PathVariable Long id) {
        return reviewService.findByBookId(id);
    }

    @GetMapping("/{id}/authors")
    public List<AuthorDto> getBookAuthors(@PathVariable Long id) {
        return authorService.findAuthorsByBook(id);
    }

    @GetMapping("/{id}/stats")
    public BookStatsDto getBookStatsByBookId(@PathVariable Long id) {
        return bookService.getBookStatsByBookId(id);
    }
}
