package org.example.cinema.controller;

import org.example.cinema.dto.Person;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/person")
public class PersonController {

    @GetMapping
    public List<Person> getPersons(){
        return List.of(
                Person.builder().nom("Houssem").build(),
                Person.builder().nom("Amani").build()
                );
    }

    @PostMapping("/add")
    public Person addPerson(@RequestBody Person person) {
        return person;
    }

}
