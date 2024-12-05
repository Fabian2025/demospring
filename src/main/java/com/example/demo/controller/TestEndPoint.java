package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestEndPoint {

    @GetMapping("/test")
    public String testEndPoint(){
        return "Hello World";
    }
}
