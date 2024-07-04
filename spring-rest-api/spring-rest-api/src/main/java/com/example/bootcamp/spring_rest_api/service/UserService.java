package com.example.bootcamp.spring_rest_api.service;


import com.example.bootcamp.spring_rest_api.model.User;

import java.util.List;

public interface UserService {
    List<User> listAll();

    User get(String userId);

    User save(User user);

    void delete(String userId);
}
