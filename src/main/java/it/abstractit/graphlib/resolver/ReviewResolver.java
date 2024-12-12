package it.abstractit.graphlib.resolver;

import it.abstractit.graphlib.business.ReviewService;
import it.abstractit.graphlib.model.graphql.types.AddBookReviewInput;
import it.abstractit.graphlib.model.graphql.types.AddReviewResponse;
import lombok.AllArgsConstructor;
import org.springframework.graphql.data.method.annotation.Argument;
import org.springframework.graphql.data.method.annotation.MutationMapping;
import org.springframework.stereotype.Controller;

@Controller
@AllArgsConstructor
public class ReviewResolver {

    private final ReviewService reviewService;

    @MutationMapping
    public AddReviewResponse addReview(@Argument AddBookReviewInput inputReview) {
        return reviewService.addReviewToBookMutation(inputReview);
    }
}
