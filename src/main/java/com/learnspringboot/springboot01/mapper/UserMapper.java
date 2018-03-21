package com.learnspringboot.springboot01.mapper;

import com.learnspringboot.springboot01.pojo.User;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserMapper {

    @Select("select * from user")
    List<User> findUserAll();
}
