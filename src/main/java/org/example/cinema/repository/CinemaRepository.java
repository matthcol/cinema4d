package org.example.cinema.repository;


import org.example.cinema.dto.Movie;
import org.springframework.data.repository.CrudRepository;
import java.util.List;

public interface CinemaRepository extends CrudRepository<Movie, Long>{
	
	List <Movie> findByTitle(String title);

}
