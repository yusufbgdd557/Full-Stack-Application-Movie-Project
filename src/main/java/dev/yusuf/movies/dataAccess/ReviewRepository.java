package dev.yusuf.movies.dataAccess;

import dev.yusuf.movies.entities.Movie;
import dev.yusuf.movies.entities.Review;
import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface ReviewRepository extends MongoRepository<Review, ObjectId> {
}
