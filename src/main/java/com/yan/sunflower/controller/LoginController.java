package com.yan.sunflower.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/login")
public class LoginController {

    @RequestMapping
    public String login(){
        System.out.println("Hello login !!!");
        return "123123";
    }

}
