package com.demo.microservices.helloservice.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class hello {

    @RequestMapping(value ="/hello")
    public String helloService()
    {
        return "Hello Micro Services!!";
    }
}
