package com.example.booksapi.controller;

import com.example.booksapi.entity.Book;
import com.example.booksapi.repository.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collection;

@RestController
@RequestMapping(value = "/books")
public class BookController {

    @Autowired
    private BookRepository bookRepository;

    @GetMapping(value = "/list")
    public ResponseEntity<Collection<Book>> getBooks() {
        return ResponseEntity.ok(bookRepository.findAll());
    }

}
