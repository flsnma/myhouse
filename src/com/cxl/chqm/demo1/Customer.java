package com.cxl.chqm.demo1;

import java.util.List;
import java.util.ArrayList;

public class Customer {
    private String name;
    private List<Product> products;

    public Customer(String name) {
        this.name = name;
        this.products = new ArrayList<>();
    }

    public void addProduct(Product product) {
        products.add(product);
    }

    public void display() {
        System.out.println(name + " 购买了:");
        for (Product product : products) {
            System.out.println( product.getName() + ", " + product.getPrice()+"元");
        }
    }
}