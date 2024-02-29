package com.example.demo.controller;


import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.StudentModelD4;

import java.util.Date;

import org.springframework.web.bind.annotation.GetMapping;

@RestController
public class D2Q4Controller {
    
    
    @GetMapping("/book")
    public StudentModelD4 getDateMethod() {
        StudentModelD4 book = new StudentModelD4("XYZ", "LMN",new Date());
        return book;

    }
    
}