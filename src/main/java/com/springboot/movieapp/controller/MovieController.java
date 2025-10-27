package com.springboot.movieapp.controller;

import com.springboot.movieapp.model.Movies;
import com.springboot.movieapp.service.MovieService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController // The best practice is to keep the routing part here in the controller file.
public class MovieController {

    private final MovieService movieService; //Movie Controller requires MovieService to work.


    public MovieController(MovieService movieService){ //Constructor DI
        this.movieService = movieService;
    }
    // Now we map the routes
    @GetMapping("/")
    public String homePage(){
        return "This is HomePage";
    }
    @GetMapping("/movies")
    public List<Movies> movies(){
        return movieService.getAllMovies();
    }
    @GetMapping("/movies/total")
    public int totalMovies(){
        return movieService.movieCount();
    }

}
