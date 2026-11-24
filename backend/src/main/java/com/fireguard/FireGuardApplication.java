package com.fireguard;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling
public class FireGuardApplication {
    public static void main(String[] args) {
        SpringApplication.run(FireGuardApplication.class, args);
    }
}
