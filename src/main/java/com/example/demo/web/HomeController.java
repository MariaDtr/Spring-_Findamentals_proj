package com.example.demo.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {

    @GetMapping("/home")
    public String index(){
        return "index";
    }
    @RequestMapping("/booking")
    public String booking(){
        return "bookingpage";
    }
}
