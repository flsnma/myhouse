package com.cxl.ch11.demo1;

public class CargoPlane implements Plane {
    @Override
    public void fly(String planeType) {
        System.out.println(planeType + "载货飞机");
    }
}
