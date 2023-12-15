package org.example.cinema.repository;

import org.example.cinema.entity.MovieEntity;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import java.util.List;

public interface CinemaRepository extends CrudRepository<MovieEntity, Integer>{
	
	List<MovieEntity> findByTitle(String title);

	@Query("select m from MovieEntity m where m.year >= :sinceYear")
	List<MovieEntity> findRecent(int sinceYear);

}
