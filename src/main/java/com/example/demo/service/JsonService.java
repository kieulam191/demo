package com.example.demo.service;

import com.example.demo.model.Product;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonElement;
import com.google.gson.JsonParser;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class JsonService {

    Gson gson;

    public JsonService() {
        gson = new Gson();
    }
    public String convertListToJson(List<Product> products) {
        Gson gson = new GsonBuilder().setPrettyPrinting().create();
        String json = gson.toJson(products);

        return json;
    }


}
