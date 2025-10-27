package com.springboot.jpa.bookApp.service;

import com.springboot.jpa.bookApp.bookrepository.BookRepo;
import com.springboot.jpa.bookApp.model.Books;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class BooksService {
    private final BookRepo repo;

    public BooksService(BookRepo repo){ // Constructor DI (BookService needs BookRepo)
        // remember the flow
        // Controller(needs service)  ---> Service(needs repo) ---> Repository(needs database) ---> Database
        this.repo= repo;
    }
    public List<Books> getAll(){
        return repo.findAll(); // Using JPA methods here.
    }
    public Books addBook(Books books){
        return repo.save(books);
    }
}
