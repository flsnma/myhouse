package com.cxl.qm.demo9;

import java.util.ArrayList;
import java.util.List;

public class Customer {
    private String name;
    private List<Product> products = new ArrayList<>();

    public Customer(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void addProduct(Product product){
        products.add(product);
    }

    public List<Product> getProducts() {
        return products;
    }

    public void setProducts(List<Product> products) {
        this.products = products;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "name='" + name + '\'' +
                ", products=" + products +
                '}';
    }
}
