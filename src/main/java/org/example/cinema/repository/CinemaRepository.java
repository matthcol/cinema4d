package org.example.cinema.repository;


import org.example.cinema.dto.Movie;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.repository.CrudRepository;
import java.util.List;
@SpringBootApplication
public interface CinemaRepository extends CrudRepository<Movie, Long>{
	Movie findById(long id);
	List <Movie> findByTitle(String title);

}
