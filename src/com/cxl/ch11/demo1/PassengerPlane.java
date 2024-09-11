package com.cxl.ch11.demo1;

public class PassengerPlane implements Plane {

    @Override
    public void fly(String planeType) {

        System.out.println(planeType + "载客飞机" );
    }
}
