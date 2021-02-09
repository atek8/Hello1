package com.example.Hello1.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;

@RestController
@RequestMapping(value = "Hello1Controller")
public class Hello1Controller {

    @GetMapping(value = "hello1")
    public String hello1Method() {
        return "Hello "+new Date();
    }
}
