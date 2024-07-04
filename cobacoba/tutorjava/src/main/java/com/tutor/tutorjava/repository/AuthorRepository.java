package com.tutor.tutorjava.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.tutor.tutorjava.model.Author;

@Repository
public interface  AuthorRepository extends JpaRepository<Author, Long> {}