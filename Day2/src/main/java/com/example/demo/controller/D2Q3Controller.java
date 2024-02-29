package com.example.demo.controller;


import org.springframework.web.bind.annotation.RestController;
import com.example.demo.model.StudentModelD3;

import org.springframework.web.bind.annotation.PostMapping;


@RestController
public class D2Q3Controller {
    
    @PostMapping("/post")
    public StudentModelD3 postDetails() {
        StudentModelD3 student = new StudentModelD3("null", 0);
        return student;
        
    }
    
}