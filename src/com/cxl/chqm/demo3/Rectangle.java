package com.cxl.chqm.demo3;

public class Rectangle implements Shape {
    private Color color;

    public Rectangle(Color color) {
        this.color = color;
    }

    @Override
    public void draw() {
        color.applyColor();
        System.out.print("矩形");
    }
}