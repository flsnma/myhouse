package com.cxl.ch13.demo2;

public class SimplePhone extends Cellphone {

    @Override
    void receiveCall() {
        System.out.println("接受来电，会发出声音");
    }
}
