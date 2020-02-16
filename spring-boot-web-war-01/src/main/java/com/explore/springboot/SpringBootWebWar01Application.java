package com.explore.springboot;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@MapperScan(basePackages = "com.explore.springboot.*.mapper")
@SpringBootApplication
public class SpringBootWebWar01Application {

    public static void main(String[] args) {
        SpringApplication.run(SpringBootWebWar01Application.class, args);
    }

}
