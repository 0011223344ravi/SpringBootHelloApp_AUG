package org.example.springboothelloapp_aug;


import org.springframework.web.bind.annotation.*;

@RestController
public class HelloController {

    @GetMapping("/hello")
    public String home() {
        return "Hello from Spring Boot! my god";
    }
}

