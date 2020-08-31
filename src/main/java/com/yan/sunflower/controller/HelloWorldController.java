package com.yan.sunflower.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/hello/")
public class HelloWorldController {

    @GetMapping("sayHello")
    public String sayHello(){
        System.out.println("Hello World !!!");
        return "<b>Hello World !!!</b>";
    }

}
