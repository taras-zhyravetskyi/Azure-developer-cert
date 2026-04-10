package com.azure.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.view.RedirectView;

@RestController
public class HelloController {

    @GetMapping("/hello")
    public RedirectView hello() {
        return new RedirectView("/hello.html");
    }

    @GetMapping("/health")
    public String health() {
        return "OK";
    }
}