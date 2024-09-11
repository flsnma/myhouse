package com.cxl.chqm.demo1;

public class CustomerTest {
    public static void main(String[] args) {
        Customer zhangSan = new Customer("张三");

        Product clothes = new Product("衣服", 100.0);
        Product shoes = new Product("鞋子", 100.5);

        zhangSan.addProduct(clothes);
        zhangSan.addProduct(shoes);

        zhangSan.display();
    }
}