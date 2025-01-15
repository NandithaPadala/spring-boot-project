package com.app.SimpleWebApp.model;

import org.springframework.stereotype.Component;

@Component
public class Product {
    

    private int prodId;
    private String prod;
    private int price;

    public Product(int prodId, String prod, int price){
        this.prodId = prodId;
        this.prod = prod;
        this.price = price;
    }
}