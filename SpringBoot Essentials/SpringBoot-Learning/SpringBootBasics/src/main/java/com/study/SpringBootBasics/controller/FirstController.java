package com.study.SpringBootBasics.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller         // Controller , looks for Html files
// @RestController     // RestController Returns data, Combination of Controller and Response
public class FirstController {
    
    // GET POST PUT DELETE
    
    // localhost:8080/Welcome
    
    @GetMapping("/welcome")
    public String welcome1() {
        return "welcome";  // Returns welcome.html view
    }
    
    @GetMapping("/about")
    public String welcome() {
        return "about";  // Returns welcome.html view
    }
    
}