package com.example.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import com.example.config.UserProperties;

@RestController
public class ConfigClient {

    private final UserProperties userProperties;

    public ConfigClient(UserProperties userProperties) {
        this.userProperties = userProperties;
    }

    @GetMapping("/whoami/{username}")
    public String whoami(@PathVariable("username") String username) {
        return String.format("Hello!" +
                "You're %s and you'll become a(n) %s...\n", username, userProperties.getRole());
    }
}
