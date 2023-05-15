package com.example.demo.repository;

import com.example.demo.model.Product;
import com.example.demo.service.ApiService;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class ApiRepository {

    List<Product> products;
    public ApiRepository() {
        if(products == null) {
            products = new ArrayList<>();
        }
        products.add(new Product("Cà phê sữa", "20000", "cà phê nguyên chất"));
        products.add(new Product("Cà phê đá", "17000", "cà phê nguyên chất"));
        products.add(new Product("Trà mật ong", "30000", "Trà thái nguyên"));
    }

    public List<Product> readProduct() {
        return products;
    }
}
