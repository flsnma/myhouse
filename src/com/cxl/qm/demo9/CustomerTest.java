package com.cxl.qm.demo9;

import java.util.ArrayList;

public class CustomerTest {
    public static void main(String[] args) {
        Customer customer = new Customer("张三");
        Product clothes = new Product("衣服", 100.5);
        Product shoe = new Product("鞋子", 200.5);
        customer.addProduct(clothes);
        customer.addProduct(shoe);

        System.out.println(customer);//or下面
        for(Product product : customer.getProducts()){
            System.out.println(product);
        }
    }
}
