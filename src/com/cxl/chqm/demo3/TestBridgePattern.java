package com.cxl.chqm.demo3;

public class TestBridgePattern {
    public static void main(String[] args) {
        Shape redRectangle = new Rectangle(new RedColor());
        redRectangle.draw();

        Shape greenCircle = new Circle(new GreenColor());
        greenCircle.draw();

        Shape blueSquare = new Square(new BlueColor());
        blueSquare.draw();
    }
}