package com.tutor.tutorjava.repository;

import com.tutor.tutorjava.model.Book;
import org.springframework.data.repository.CrudRepository;

import java.util.List;
import java.util.Optional;

public interface BookRepository extends CrudRepository<Book, Long> {
    List<Book> findByTitle(String title);
//    Optional<Book> findByAuthor(String author);
}