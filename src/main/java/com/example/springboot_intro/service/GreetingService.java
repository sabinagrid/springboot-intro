package com.example.springboot_intro.service;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

@Service
public class GreetingService {

    @Value("${app.custom.greeting}")
    private String customGreeting;

    public String getGreeting() {
        return customGreeting;
    }
}
