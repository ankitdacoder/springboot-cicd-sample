package com.webdacoder.simple.controller;

import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/home")
public class HomeController {

    @GetMapping("/status")
    public String getHome(){
     return "I am at home";
    }

    @GetMapping("/port")
    public String checkPort(){
        return "8080";
    }


}
