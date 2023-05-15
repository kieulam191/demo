package com.example.demo.model;

public class Product {

    private String name;
    private String price;
    private String description;

    public Product(String name, String price, String description) {
        this.name = name;
        this.price = price;
        this.description = description;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        return "{" +
                "name: \"" + this.name + "\", " +
                "price: " + this.price + ", " +
                "Description: \"" + this.description + "\"" +
                "}";
    }
}
