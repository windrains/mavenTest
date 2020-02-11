package com.explore.starter.controller;

import com.explore.starter.HelloProperties;
import com.explore.starter.HelloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @Autowired
    HelloService helloService;

    @Autowired
    HelloProperties helloProperties;


    @GetMapping("/hello")
    public String hello(){
        return helloService.sayHello("tom");
    }

    @GetMapping("/hello2")
    public String hello2(){
        return helloProperties.getBefore()+"-"+helloProperties.getAfter();
    }

}
