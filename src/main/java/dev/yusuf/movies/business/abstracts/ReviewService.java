package dev.yusuf.movies.business.abstracts;

import dev.yusuf.movies.entities.Review;

public interface ReviewService {
    Review createReview(String reviewBody, String imdbId);

}
