package com.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@EnableConfigurationProperties(UserProperties.class)
public class ClientconfigApplication {

    public static void main(String[] args) {
        SpringApplication.run(ClientconfigApplication.class, args);
    }

}
