package com.library.books.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.library.books.models.Books;
import com.library.books.repository.BookRepository;

@Service
public class BookService {

    @Autowired
    private BookRepository bookRepository;

    public List<Books> getAll() {
        return bookRepository.findAll();
    }

    public Optional<Books> getById(String id) {
        return bookRepository.findById(Long.valueOf(id));
    }

    public Books add(Books book) {
        return bookRepository.save(book);
    }

    public Books update(long id, Books book) {
        book.setId(id);
        return bookRepository.save(book);
    }

    public void remove(long id) {
        bookRepository.deleteById(id);
    }

}
