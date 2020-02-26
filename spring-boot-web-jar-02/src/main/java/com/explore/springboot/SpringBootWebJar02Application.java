package com.explore.springboot;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@MapperScan(basePackages = "com.explore.springboot.*.mapper")
@SpringBootApplication
public class SpringBootWebJar02Application {

    public static void main(String[] args) {
        SpringApplication.run(SpringBootWebJar02Application.class, args);
    }

}
