package com.example.UC_1HelloWold;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
class HelloWorldController {
    @GetMapping("/hello")
    public String sayHello() {
        return "Hello from BridgeLabz";
    }
}
