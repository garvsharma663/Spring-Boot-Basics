package com.springboot.movieapp.service;


import com.springboot.movieapp.model.Movies;
import org.springframework.stereotype.Service;

import java.util.List;

@Service // Marking this with @Service annotation, keeping only the business logic here.
public class MovieService {

    // Creating helper methods that will be called when routing to the web pages.
    public List<Movies> getAllMovies(){
        return List.of(new Movies("A", 5),
                new Movies("B", 4),
                new Movies("C", 4));
    }

    public int movieCount(){
        List<Movies> moviesList = getAllMovies();
        return moviesList.size();
    }

}
