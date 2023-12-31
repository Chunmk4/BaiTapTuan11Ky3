package com.example.qlsp.models;

public class Product {
    private String name;
    private String description;
    private int id;
    private double price;

    public Product(){}
    public Product(int id, String name, String description, double price) {
        this.name = name;
        this.description = description;
        this.id = id;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
