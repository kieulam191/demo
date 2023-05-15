package com.example.demo.controller;

import com.example.demo.model.Product;
import com.example.demo.service.ApiService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ApiController {
    @Autowired
    ApiService apiService;

    @GetMapping("/")
    public String getApi() {
        return "GET api/products";
    }

    @GetMapping("/api/products")
    public String fetchProduct() {
        return  apiService.getProduct();
    }
}
