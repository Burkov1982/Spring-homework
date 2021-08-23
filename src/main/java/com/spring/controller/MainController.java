package com.spring.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping(path = "/")
public class MainController {

    @GetMapping()
    public String doGet() {
        return "index";
    }

    @PostMapping()
    public String doPost() {
        return "index";
    }
}
