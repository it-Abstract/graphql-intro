package it.abstractit.graphlib.business;

import it.abstractit.graphlib.model.dto.BookOverFetchDto;
import it.abstractit.graphlib.model.dto.BookStatsDto;
import it.abstractit.graphlib.model.dto.BookUnderFetchDto;
import it.abstractit.graphlib.model.entity.BookEntity;
import it.abstractit.graphlib.model.entity.ReviewEntity;
import it.abstractit.graphlib.model.graphql.types.Book;
import it.abstractit.graphlib.model.mapper.LibraryMapper;
import it.abstractit.graphlib.repository.BookRepository;

import it.abstractit.graphlib.repository.ReviewRepository;
import lombok.AllArgsConstructor;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

@Service
@AllArgsConstructor
@Transactional
public class BookService {
    protected final Logger logger = LoggerFactory.getLogger(getClass());

    private final BookRepository bookRepository;
    private final ReviewRepository reviewRepository;
    private LibraryMapper libraryMapper;

    @Transactional
    public List<BookUnderFetchDto> findAll() {
        List<BookEntity> books = bookRepository.findAll();
        logger.info("Found {} books", books.size());
        books.forEach(book -> {
            if(book.getAuthors() != null && !book.getAuthors().isEmpty()) {
                logger.info("!= null");
            }else{
                logger.info("null");
            }
        });
        return null;
    }

    public List<Book> resolveAll() {
        return bookRepository.findAll().stream().map(libraryMapper::bookToBookGraphQl).toList();
    }

    public BookUnderFetchDto findById(Long id) {
        return bookRepository.findById(id).map(libraryMapper::bookToBookDto).orElse(null);
    }

    public BookStatsDto getBookStatsByBookId(Long id) {
        List<String> top3BookComments = reviewRepository.findTop3ByBookIdOrderByReviewDateDesc(id).stream().map(ReviewEntity::getComment).toList();
        Double averageRatingForBook = reviewRepository.getAverageRatingForBook(id);
        return new BookStatsDto(id, averageRatingForBook, top3BookComments);
    }

    public Book resolveById(Long id) {
        return bookRepository.findById(id).map(libraryMapper::bookToBookGraphQl).orElse(null);
    }

    public BookOverFetchDto findByIdOverfetch(Long id) {
        return bookRepository.findById(id).map(libraryMapper::bookToBookOverFetchDto).orElse(null);
    }

    public BookEntity save(BookEntity book) {
        return bookRepository.save(book);
    }

    public BookEntity updateBook(BookEntity book) {
        Optional<BookEntity> bookToUpdate = bookRepository.findById(book.getId());
        if (bookToUpdate.isPresent()) {
            return bookRepository.save(book);
        }
        throw new RuntimeException("Book not found");
    }

    public void deleteById(Long id) {
        bookRepository.deleteById(id);
    }
}
