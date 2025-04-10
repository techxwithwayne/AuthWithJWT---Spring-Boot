package com.cumaya.AuthWithJWT.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

    @GetMapping("/dashboard")
    public String dashboard(){
        return "Welcome Home";
    }
}
