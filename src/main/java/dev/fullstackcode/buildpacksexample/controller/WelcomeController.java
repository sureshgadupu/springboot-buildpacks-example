package dev.fullstackcode.buildpacksexample.controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WelcomeController {


    @GetMapping("/readTextFile2")
    public String sayHello()  {

        return "sayHello";
    }
}
