package org.example.cinema.controller;

import org.example.cinema.dto.Movie;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/movie")
public class MovieController {

    @GetMapping
    public List<Movie> recentMovies(){
        return List.of(
                Movie.builder().title("Oppenheimer").build(),
                Movie.builder().title("Hunger Games").build()
        );
    }

    @ResponseStatus(HttpStatus.CREATED)
    @PostMapping
    public Movie add(Movie movie) {
        movie.setId((int) Math.round(Math.random()*100000));
        return movie;
    }
}
