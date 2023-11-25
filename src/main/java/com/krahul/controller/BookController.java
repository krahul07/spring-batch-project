package com.krahul.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/app")
public class BookController {

    @GetMapping("/test")
    public String testConn(){
        return "App is running!!";
    }
}
