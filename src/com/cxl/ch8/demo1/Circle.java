package com.cxl.ch8.demo1;

public class Circle extends Shape {
    private int radius;

    public Circle() {
    }

    public Circle(int radius) {
        this.radius = radius;
    }

    public Circle(int x, int y, String color, int radius) {
        super(x, y, color);
        this.radius = radius;
    }

    public Circle(Circle source) {
        super(source);
        this.radius = source.radius;
    }

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    @Override
    public Shape clone() {
        return new Circle(this);
    }

    @Override
    public String toString() {
        return  super.toString()+"Circle{" +
                "radius=" + radius +
                "} " ;
    }
}
