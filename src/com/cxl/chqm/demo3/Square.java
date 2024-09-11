package com.cxl.chqm.demo3;

public class Square implements Shape {
    private Color color;

    public Square(Color color) {
        this.color = color;
    }

    @Override
    public void draw() {
        color.applyColor();
        System.out.print("正方形");
    }
}