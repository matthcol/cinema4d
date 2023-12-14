package org.example.cinema.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("/api/movie")
public class MovieController {

    @GetMapping("")
    public String info(){
        return "api movie";
    }
}
