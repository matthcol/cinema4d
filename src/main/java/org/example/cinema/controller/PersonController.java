package org.example.cinema.controller;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.example.cinema.dto.Person;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/person")
@Tag(name = "Person API")
public class PersonController {

    @Operation(summary = "List all persons", description = "Returns a collection of persons")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "Successfully retrieved"),
            @ApiResponse(responseCode = "404", description = "Not found - The product was not found")
    })
    @GetMapping
    public ResponseEntity<List<Person>> getPersons() {
        return ResponseEntity.ok(List.of(
                Person.builder().firstname("Houssem").build(),
                Person.builder().firstname("Amani").build()
        ));
    }

    @Operation(summary = "Add a person", description = "Return a newly saved person")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "201", description = "Successfully created"),
            @ApiResponse(responseCode = "400", description = "Bad Request")
    })
    @PostMapping("/add")
    public ResponseEntity<Person> addPerson(@RequestBody Person person) {
        person.setId((int) Math.round(Math.random() * 100000));
        return new ResponseEntity<>(person, HttpStatus.CREATED);
    }

}
