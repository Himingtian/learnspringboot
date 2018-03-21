package com.learnspringboot.springboot01;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;

@SpringBootApplication
@MapperScan(basePackages = "com.learnspringboot.springboot01.mapper")
@EnableCaching
public class springboot01 {
    public static void main(String[] args) {
        SpringApplication.run(springboot01.class, args);
    }
}
