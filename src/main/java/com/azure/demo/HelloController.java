package com.azure.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @GetMapping("/")
    public String hello() {
        return "Hello from Azure App Service!";
    }

    @GetMapping("/health")
    public String health() {
        return "OK";
    }
}