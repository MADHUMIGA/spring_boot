package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.StudentModelD2;

@RestController
public class D2Q2controller {
    
    @GetMapping("/stu")
    public StudentModelD2 methodName(){
        StudentModelD2 p=new StudentModelD2(34,"madhu","good");
        return p;
    }
}
