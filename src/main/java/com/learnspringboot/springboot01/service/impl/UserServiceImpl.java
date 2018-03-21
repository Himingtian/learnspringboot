package com.learnspringboot.springboot01.service.impl;

import com.learnspringboot.springboot01.mapper.UserMapper;
import com.learnspringboot.springboot01.pojo.User;
import com.learnspringboot.springboot01.service.UserService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
@Service
public class UserServiceImpl implements UserService {

    @Resource(name = "userMapper")
    private UserMapper userMapper;

    @Override
    public List<User> findUserAll() {
        return userMapper.findUserAll();
    }
}
