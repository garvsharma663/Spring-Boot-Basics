package com.springboot.app.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController // Class marked with this handles web requests and return Data (Not HTML).
public class MovieController {
    @GetMapping("/movies") // Maps the URL /movies to method getMoviesList()
    // When request is received, SpringBoot finds the correct controller --> calls the corresponding method and
    // converts the returned Java object to JSON (automatically), or Text as per the returned type of method.


    public List<String> getMoviesList(){
        return List.of("SpiderMan 1","SpiderMan 2, SpiderMan 3");
    }
    @GetMapping("/movies/count")
    public int moviesCount(){
        return 3;
    }

}
