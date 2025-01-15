package com.app.SimpleWebApp.service;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

import com.app.SimpleWebApp.model.Product;

@Service
public class ProductService {
    
    List<Product> products = new ArrayList(Arrays.asList(new Product(101,"Wireless Mouse",2000),new Product(102, "Camera", 20000)));

    public List<Product> getProducts(){
        return products;
    }

}