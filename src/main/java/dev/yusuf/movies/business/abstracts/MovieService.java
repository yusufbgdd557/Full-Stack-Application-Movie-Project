package dev.yusuf.movies.business.abstracts;

import dev.yusuf.movies.entities.Movie;
import org.bson.types.ObjectId;

import java.util.List;
import java.util.Optional;

public interface MovieService {
    List<Movie> getAllMovies();
    Movie getById(ObjectId id) throws Exception;
    Movie getByImdbId(String imdbId) throws Exception;
}
