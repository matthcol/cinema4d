package org.example.cinema.controller;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.example.cinema.dto.Movie;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/movie")
@Tag(name = "Movie API")
public class MovieController {

    @Operation(summary = "List all recent movies", description = "Returns a collection of recent movies")
    @ApiResponses(value={
            @ApiResponse(responseCode = "200", description = "Successfully retrieved"),
            @ApiResponse(responseCode = "404", description = "Not found - The product was not found")
    })
    @GetMapping
    public List<Movie> recentMovies() {
        return List.of(
                Movie.builder().title("Oppenheimer").build(),
                Movie.builder().title("Hunger Games").build()
        );
    }

    @Operation(summary = "Add a movie", description = "Returns the newly saved movie")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "201", description = "Successfully created"),
            @ApiResponse(responseCode = "400", description = "Bad Request")
    })
    @ResponseStatus(HttpStatus.CREATED)
    @PostMapping
    public Movie add(@RequestBody Movie movie) {
        movie.setId((int) Math.round(Math.random() * 100000));
        return movie;
    }
}
