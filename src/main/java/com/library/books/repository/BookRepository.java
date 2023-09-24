package com.library.books.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.library.books.models.Books;

public interface BookRepository extends JpaRepository<Books, Long>{
}
