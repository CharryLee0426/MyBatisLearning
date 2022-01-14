package com.lichen.mybatislearning;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan(basePackages = "com.lichen.mybatislearning.dao")
public class MybatisLearningApplication {

    public static void main(String[] args) {
        SpringApplication.run(MybatisLearningApplication.class, args);
    }

}
