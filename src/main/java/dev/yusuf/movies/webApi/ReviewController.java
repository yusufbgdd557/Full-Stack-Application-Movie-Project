package dev.yusuf.movies.webApi;

import dev.yusuf.movies.business.abstracts.ReviewService;
import dev.yusuf.movies.entities.Review;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

@RestController
@AllArgsConstructor
//@CrossOrigin(origins = "http://localhost:3000")//Local Config and Origin allowance
@RequestMapping("/api/v1/reviews")
public class ReviewController {

    @Autowired
    private ReviewService reviewService;

    @PostMapping("/createReview")
    public Review createReview(@RequestBody Map<String, String> payload) {
        return reviewService.createReview(payload.get("reviewBody"), payload.get("imdbId"));
    }

}
