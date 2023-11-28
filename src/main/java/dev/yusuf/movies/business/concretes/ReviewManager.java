package dev.yusuf.movies.business.concretes;

import dev.yusuf.movies.business.abstracts.ReviewService;
import dev.yusuf.movies.dataAccess.ReviewRepository;
import dev.yusuf.movies.entities.Movie;
import dev.yusuf.movies.entities.Review;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Update;
import org.springframework.stereotype.Repository;

@Repository
@AllArgsConstructor
public class ReviewManager implements ReviewService {

    @Autowired
    private ReviewRepository reviewRepository;

    private MongoTemplate mongoTemplate;

    @Override
    public Review createReview(String reviewBody, String imdbId) {
         Review review = reviewRepository.insert(new Review(reviewBody));
         mongoTemplate.update(Movie.class)
                 .matching(Criteria.where("imbdId").is(imdbId))
                 .apply(new Update().push("reviewIds").value(review))
                 .first();
         return review;
    }
}
