package com.moocode.quotses_api;

import org.springframework.stereotype.Service;

@Service
public class GreatingService {
   String getGreetingMessage(){
       return "hello form greatingService";
   }
}
