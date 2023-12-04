package dev.yusuf.movies.webApi;

import dev.yusuf.movies.business.abstracts.MovieService;
import dev.yusuf.movies.entities.Movie;
import lombok.AllArgsConstructor;
import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@AllArgsConstructor
//@CrossOrigin(origins = "http://localhost:3000")
@RequestMapping("/api/v1/movies")
public class MovieController {

    @Autowired
    private MovieService movieService;

    @GetMapping
    public ResponseEntity<List<Movie>> getAllMovies() {
        return new ResponseEntity<List<Movie>>(movieService.getAllMovies(), HttpStatus.OK);
    }
    @GetMapping("/getById/{id}")
    public Movie getById(@PathVariable ObjectId id) throws Exception {
        return movieService.getById(id);
    }
    @GetMapping("/getByImdb/{imdbId}")
    public Movie getByImdbId(@PathVariable String imdbId) throws Exception {
        return movieService.getByImdbId(imdbId);
    }
}
