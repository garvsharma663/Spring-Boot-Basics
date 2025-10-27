package com.springboot.jpa.bookApp.controller;

import com.springboot.jpa.bookApp.model.Books;
import com.springboot.jpa.bookApp.service.BooksService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

// THE FLOW :
// Controller ---> Service ---> Repository ---> Database

@RestController
@RequestMapping("/books") // we are using this to save the over writing of @GetMapping("/books") on top of all methods.
public class BooksController {

    private final BooksService booksService;

    public BooksController(BooksService booksService){ // BooksController needs BooksService.
        this.booksService=booksService;
    }

    @GetMapping
    public List<Books> getallBooks(){
        return booksService.getAll();
    }
    @PostMapping
    public Books addBook(@RequestBody Books books){
        return booksService.addBook(books);
    }
}
