package com.moocode;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDateTime;

@RestController
@RequestMapping("/api")
public class HelloController {

    @GetMapping("/hello")
    public String getHello(){
        return "Hello, Welcome to Spring Boot!";
    }
    // for testing, spring boot acceptn't two endpoints
    //    @GetMapping("/hello")
    //    public String duplicateHello() {
    //        return "This is a duplicate endpoint!";
    //    }
    @GetMapping("/about")
    public String getAbout(){
        return "I am a Backend Developer building Spring Boot APIs!";
    }
    @GetMapping("/time")
    public String getTime(){
        return "current time is: " + LocalDateTime.now();
    }
}
