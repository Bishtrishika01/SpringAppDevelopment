package com.example.UC_3HelloWold;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class HelloController {
    @GetMapping("welcome")
    public String sayHello() {
        return "Hello from BridgeLabz";
    }
}
