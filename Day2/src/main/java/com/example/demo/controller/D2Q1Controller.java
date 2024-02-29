package com.example.demo.controller;

   

import org.springframework.web.bind.annotation.RestController;

import com.example.demo.config.AppConfig;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;

    @RestController
    public class D2Q1Controller {
       @Autowired
       AppConfig conf;
    
       @GetMapping("/info")
       public String getApp() {
          return new String(conf.getAppName());
       }
    
    }