package com.example.bootcamp.springboot_jdbc.repository;

import com.example.bootcamp.springboot_jdbc.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, String> {

}
