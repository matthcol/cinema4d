package org.example.cinema.services.interfaces;

import org.example.cinema.dto.Movie;

import java.util.List;

public interface IMovieService {

    public Movie findById(final Integer id);
    public List<Movie> findAll();
    public Movie create(final Movie movie);
    public Movie update(final Movie movie);
    public void delete(final Integer id);

}
