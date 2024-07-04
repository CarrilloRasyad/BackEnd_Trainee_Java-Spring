package com.tutor.tutorjava.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import io.micrometer.common.lang.NonNull;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import jakarta.persistence.UniqueConstraint;
import lombok.Data;
// import lombok.Getter;
// import lombok.Setter;

@Entity
@Data
@Table(name = "Book", uniqueConstraints= {@UniqueConstraint(columnNames={"id"})})
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
public class Book{
    @Id
    @NonNull
    @GeneratedValue(strategy= GenerationType.AUTO)
    private long id;

    @NonNull
    private String title;

    @ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name = "author.id", referencedColumnName = "id")
    private Author author;
}

