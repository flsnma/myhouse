package com.cxl.ch8.demo1;

public class Client {
    public static void main(String[] args) {
        Circle circle = new Circle(5, 5, "red", 20);
        Circle clone = (Circle)circle.clone();
        System.out.println(circle);
        System.out.println(clone);
        Rectangle rectangle = new Rectangle(5, 5, "blue", 10, 20);
        Rectangle clone1 = (Rectangle) rectangle.clone();
        System.out.println(rectangle);
        System.out.println(clone1);

    }
}
