package dev.yusuf.movies.business.concretes;

import dev.yusuf.movies.dataAccess.MovieRepository;
import dev.yusuf.movies.entities.Movie;
import dev.yusuf.movies.business.abstracts.MovieService;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@NoArgsConstructor
@AllArgsConstructor
public class MovieManager implements MovieService {

    @Autowired
    private MovieRepository movieRepository;

    @Override
    public List<Movie> getAllMovies() {
        return movieRepository.findAll();
    }

    @Override
    public Movie getById(ObjectId id) throws Exception {
        Optional<Movie> optionalMovie = movieRepository.findById(id);
        if (optionalMovie.isEmpty()){
            throw new Exception("Movie is not existing!");
        }
        return optionalMovie.get();
    }

    @Override
    public Movie getByImdbId(String imdbId) throws Exception {
        Optional<Movie> optionalMovie = movieRepository.findMovieByImdbId(imdbId);
        if (optionalMovie.isEmpty()){
            throw new Exception("Movie doesn't exist with this Imdb!");
        }
        return optionalMovie.get();
    }
}
