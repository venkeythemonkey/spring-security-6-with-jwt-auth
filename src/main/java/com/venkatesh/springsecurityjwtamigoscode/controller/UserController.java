package com.venkatesh.springsecurityjwtamigoscode.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;


@RestController
@RequestMapping("/api/v1/user")
public class UserController {

    @GetMapping
    public String helloUser() {
        return "Hello User bro";
    }
    

}
