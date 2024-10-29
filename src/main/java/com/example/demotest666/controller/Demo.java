package com.example.demotest666.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Demo {

    @GetMapping("demo")
    public String demo(){
        return "success";
    }

}
