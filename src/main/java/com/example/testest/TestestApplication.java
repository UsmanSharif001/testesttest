package com.example.testest;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class TestestApplication {

    @GetMapping("/welcomemessage")
    public String message() {
        return "Welcome to my website";
    }

    public static void main(String[] args) {
        SpringApplication.run(TestestApplication.class, args);
    }

}
