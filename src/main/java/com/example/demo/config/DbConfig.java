package com.example.demo.config;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class DbConfig implements CommandLineRunner {
    @Override
    public void run(String... args) throws Exception {
        System.out.println("da vao config!!!");
    }
}
