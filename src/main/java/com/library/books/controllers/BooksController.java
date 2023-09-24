package com.library.books.controllers;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.library.books.models.Books;
import com.library.books.services.BookService;

@RestController
@RequestMapping("/api/books")
public class BooksController {

    @Autowired
    private BookService bookService;

    @GetMapping("/")
    public List<Books> getAllBooks() {
        return bookService.getAll();
    }

    @GetMapping("/{id}")
    public Optional<Books> getAllBooks(@PathVariable String id) {
        return bookService.getById(id);
    }

    @PostMapping("/add")
    public Books add(@RequestBody Books book) {
        return bookService.add(book);
    }

    @PutMapping("/update/{id}")
    public Books update(@PathVariable Long id, @RequestBody Books book) {
        return bookService.update(id, book);
    }

    @DeleteMapping("/delete/{id}")
    public void remove(@PathVariable Long id) {
        bookService.remove(id);
    }

}
