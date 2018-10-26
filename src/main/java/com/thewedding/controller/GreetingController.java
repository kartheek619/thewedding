package com.thewedding.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class GreetingController {

    @GetMapping("/greeting")
    public String greeting(Model model) {
        return "greeting";
    }

    @GetMapping("/when-where.html")
    public String greetings(Model model) {
        return "when-where";
    }

}