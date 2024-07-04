package com.tutor.tutorjava;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@EnableJpaRepositories("com.tutor.tutorjava.repository")
@EntityScan("com.tutor.tutorjava.model")

@SpringBootApplication
@RestController
public class TutorjavaApplication {
	public static void main(String[] args) {
		SpringApplication.run(TutorjavaApplication.class, args);
	}
}
