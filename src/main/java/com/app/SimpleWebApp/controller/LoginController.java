package com.app.SimpleWebApp.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LoginController {
    

    @RequestMapping("/about")
    public String login(){
        return "You are now logged in";
    }
}
