package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@RestController
public class TestEndPoint {

    @GetMapping("/gettest")
    public String getTestEndPoint(){
        return "Hello Get World";
    }

    @PostMapping("/posttest")
    public String PostTestEndPoint(){
        return "Hello Post World";
    }

    @PutMapping("/puttest")
    public String putTestEndPoint(){
        return "Hello Put World";
    }

    @DeleteMapping("/deletetest")
    public String deleteTestEndPoint(){
        return "Hello Delete World";
    }

    @PatchMapping("/patchtest")
    public String patchTestEndPoint(){
        return "Hello Patch World";
    }
}
