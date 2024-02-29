package com.example.demo.model;

import com.fasterxml.jackson.annotation.JsonProperty;

public class StudentModelD3 {
    @JsonProperty("My Name :")
    private String name;
    @JsonProperty("My Age")
    private int age;
    public StudentModelD3(String name, int age) {
        this.name = name;
        this.age = age;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
    
}