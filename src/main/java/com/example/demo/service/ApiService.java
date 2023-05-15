package com.example.demo.service;

import com.example.demo.model.Product;
import com.example.demo.repository.ApiRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ApiService {

    @Autowired
    ApiRepository apiRepository;

    @Autowired
    JsonService jsonService;

    public String getProduct() {
        String json = jsonService.convertListToJson(apiRepository.readProduct());
        return json;
    }
}
