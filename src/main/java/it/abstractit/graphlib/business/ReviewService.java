package it.abstractit.graphlib.business;

import it.abstractit.graphlib.model.dto.ReviewDtoIn;
import it.abstractit.graphlib.model.entity.BookEntity;
import it.abstractit.graphlib.model.dto.ReviewDto;
import it.abstractit.graphlib.model.entity.ReviewEntity;
import it.abstractit.graphlib.model.entity.UserEntity;
import it.abstractit.graphlib.model.graphql.types.AddBookReviewInput;
import it.abstractit.graphlib.model.graphql.types.AddReviewResponse;
import it.abstractit.graphlib.model.graphql.types.Review;
import it.abstractit.graphlib.model.mapper.LibraryMapper;
import it.abstractit.graphlib.repository.BookRepository;
import it.abstractit.graphlib.repository.ReviewRepository;
import it.abstractit.graphlib.repository.UserRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Date;
import java.util.List;

@Service
@AllArgsConstructor
public class ReviewService {

    private final ReviewRepository reviewRepository;
    private final BookRepository bookRepository;
    private final UserRepository userRepository;
    private final LibraryMapper libraryMapper;

    @Transactional
    public List<ReviewDto> findByBookId(Long bookId) {
        return reviewRepository
                .findByBookId(bookId)
                .stream()
                .map(libraryMapper::reviewToReviewDto)
                .toList();
    }

    @Transactional
    public List<Review> resolveByBookId(Long bookId) {
        return reviewRepository
                .findByBookId(bookId)
                .stream()
                .map(libraryMapper::reviewToReviewGraphQl)
                .toList();
    }

    @Transactional
    public ReviewDto addReviewToBook(ReviewDtoIn reviewDtoIn) {
        ReviewEntity createdReview = createReview(reviewDtoIn.bookId(), reviewDtoIn.userId(), reviewDtoIn.rating(), reviewDtoIn.comment());
        return libraryMapper.reviewToReviewDto(createdReview);
    }

    @Transactional
    public AddReviewResponse addReviewToBookMutation(AddBookReviewInput reviewInput) {
        createReview(Long.valueOf(reviewInput.getBookId()), Long.valueOf(reviewInput.getUserId()), reviewInput.getRating(), reviewInput.getComment());
        Double avgRating = reviewRepository.getAverageRatingForBook(Long.valueOf(reviewInput.getBookId()));
        List<String> latestReviews = reviewRepository.findTop3ByBookIdOrderByReviewDateDesc(Long.valueOf(reviewInput.getBookId()))
                .stream()
                .map(ReviewEntity::getComment)
                .toList();

        return AddReviewResponse.newBuilder()
                .book(libraryMapper
                        .bookToBookGraphQl(bookRepository.findById(Long.valueOf(reviewInput.getBookId()))
                                .orElseThrow(() -> new RuntimeException("Book not found"))))
                .topReviews(latestReviews)
                .averageRating(avgRating)
                .build();
    }

    private ReviewEntity createReview(Long bookId, Long userId, int rating, String comment) {
        BookEntity bookToReview = bookRepository
                .findById(bookId)
                .orElseThrow(() -> new RuntimeException("Book not found"));
        UserEntity reviewerUser = userRepository.findById(userId)
                .orElseThrow(() -> new RuntimeException("User not found"));
        ReviewEntity reviewToCreate = new ReviewEntity();
        reviewToCreate.setUser(reviewerUser);
        reviewToCreate.setBook(bookToReview);
        reviewToCreate.setReviewDate(new Date());
        reviewToCreate.setRating(rating);
        reviewToCreate.setComment(comment);
        reviewRepository.save(reviewToCreate);
        return reviewToCreate;
    }
}
