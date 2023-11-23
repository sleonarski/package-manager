package com.orion.packagemanager;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SimpleController {

    @GetMapping("/home")
    String showGreetings() {
        return "Welcome! This is my app! ENJOY!";
    }
}
