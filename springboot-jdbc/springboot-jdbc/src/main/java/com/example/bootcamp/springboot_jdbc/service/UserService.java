package com.example.bootcamp.springboot_jdbc.service;

import com.example.bootcamp.springboot_jdbc.model.User;

import java.util.List;

public interface UserService {
    List<User> listAll();

    User get(String userId);

    User save(User user);

    void delete(String userId);
}
