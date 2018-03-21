package com.learnspringboot.springboot01.service;

import com.learnspringboot.springboot01.pojo.User;

import java.util.List;

public interface UserService {
    List<User> findUserAll();
}
