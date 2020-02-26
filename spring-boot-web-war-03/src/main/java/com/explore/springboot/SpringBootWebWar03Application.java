package com.explore.springboot;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@MapperScan(basePackages = "com.explore.springboot.*.mapper")
@SpringBootApplication
public class SpringBootWebWar03Application {

    public static void main(String[] args) {
        SpringApplication.run(SpringBootWebWar03Application.class, args);
    }

}
