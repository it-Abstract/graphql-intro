package it.abstractit.graphlib.rest;

import it.abstractit.graphlib.business.ReviewService;
import it.abstractit.graphlib.model.dto.ReviewDto;
import it.abstractit.graphlib.model.dto.ReviewDtoIn;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/reviews")
@AllArgsConstructor
public class ReviewRestController {

    final ReviewService reviewService;

    @PostMapping
    public ReviewDto addReview(@RequestBody ReviewDtoIn reviewDtoIn) {
        return reviewService.addReviewToBook(reviewDtoIn);
    }
}
