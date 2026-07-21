package com.moocode;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

// Marks this class as a Spring Boot app and enables auto-configuration
@SpringBootApplication
// Tells Spring that this class will handle web/HTTP requests
@RestController
public class Application {

    // Main entry point - starts the built-in web server (Tomcat)
    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }

    // Listens for GET requests at the root URL ("/")
    @GetMapping
    public String hellWorld(){
        return "hello world spring boot ";
    }

}
