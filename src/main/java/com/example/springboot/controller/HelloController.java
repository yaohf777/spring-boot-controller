package com.example.springboot.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @GetMapping("/")
    // http://localhost:8080/spring-boot/
    public String index() {
        
        return "Greetings from Spring Boot!";
    }

}
