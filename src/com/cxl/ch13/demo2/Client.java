package com.cxl.ch13.demo2;

public class Client {
    public static void main(String[] args) {
        Cellphone simplePhone = new SimplePhone();
        simplePhone.receiveCall();
        System.out.println("------------------------");
        JarPhone jarPhone = new JarPhone(simplePhone);
        jarPhone.receiveCall();
        ComplexPhone complexPhone = new ComplexPhone(jarPhone);
        complexPhone.receiveCall();
    }
}
