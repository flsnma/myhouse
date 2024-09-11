package com.cxl.ch9.demo1;

import com.cxl.ch9.demo1.pojo.User;

public class MyTest {
    public static void main(String[] args) {
        User instance = User.getInstance();
        User instance1 = User.getInstance();
        User instance2 = User.getInstance();
        System.out.println(instance == instance2);


    }
}
