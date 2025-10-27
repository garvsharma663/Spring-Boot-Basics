package com.springboot.jpa.bookApp.bookrepository;

import com.springboot.jpa.bookApp.model.Books;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookRepo extends JpaRepository<Books, Integer> {
    // Making this interface extend JpaRepository as it provides the queries already like findAll() etc.
    // <Entity Type, Primary key type>
}
