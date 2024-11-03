package com.example.configclient;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RequiredArgsConstructor
    @RestController
    public class GreetingController {

        private final MessageManager greetingManager;

        @GetMapping("/hello/{name}")
        public String hello(@PathVariable String name) {
            return greetingManager.hello(name);
        }

    }
