package com.cxl.ch8.demo1;

public class Rectangle extends Shape {
    private int width;
    private int height;

    public Rectangle() {
    }

    public Rectangle(int width, int height) {
        this.width = width;
        this.height = height;
    }
    public Rectangle(Rectangle source) {
        super(source);
        this.width = source.width;//是用source.
        this.height = source.height;
    }
    public Rectangle(int x, int y, String color, int width, int height) {
        super(x, y, color);
        this.width = width;
        this.height = height;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    @Override
    public Shape clone() {
        return new Rectangle(this);
    }

    @Override
    public String toString() {
        return super.toString()+"Rectangle{" +
                "width=" + width +
                ", height=" + height +
                "} " ;
    }
}
