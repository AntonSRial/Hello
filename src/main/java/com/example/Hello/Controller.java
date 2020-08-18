package com.example.Hello;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {

    @GetMapping("/hello")
    public String hello(@RequestParam(value = "name", defaultValue = "Anton")String name){
        return "Hello " + name+"!";
    }
}
