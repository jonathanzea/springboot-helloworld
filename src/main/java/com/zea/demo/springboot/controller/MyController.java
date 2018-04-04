package com.zea.demo.springboot.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyController {

    @RequestMapping("/helloworld")
    public String helloWorld(){
        return "hi!";
    }

}
