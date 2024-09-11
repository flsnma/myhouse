package com.cxl.chqm.demo3;

public class Circle implements Shape {
    private Color color;

    public Circle(Color color) {
        this.color = color;
    }

    @Override
    public void draw() {
        color.applyColor();
        System.out.print("圆形");
    }
}