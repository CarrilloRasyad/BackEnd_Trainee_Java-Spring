package com.tutor.tutorjava.model;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import io.micrometer.common.lang.NonNull;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import jakarta.persistence.UniqueConstraint;
import lombok.Data;


@Entity
@Data
@Table(name = "Author", uniqueConstraints= {@UniqueConstraint(columnNames={"id"})})
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler", "book"})
public class Author{
    @Id
    @NonNull
    @GeneratedValue(strategy= GenerationType.AUTO)
    private long id;

    @NonNull
    private String first_name;

    @NonNull
    private String last_name;

    @OneToMany(mappedBy = "author")
    private List<Book> book;

    // public long getId() {
    //     return id;
    // }

}
