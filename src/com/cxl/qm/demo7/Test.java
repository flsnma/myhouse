package com.cxl.qm.demo7;

public class Test {
    public static void main(String[] args) {
        Shape circle = Factory.getShape("circle");
        circle.draw();
    }
}
