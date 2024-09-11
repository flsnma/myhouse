package com.cxl.ch13.demo2;

public class PhoneDecorator extends Cellphone {
    private Cellphone phone;

    public PhoneDecorator(Cellphone phone) {
        this.phone = phone;
    }

    @Override
    void receiveCall() {
        System.out.println("接受来电，会发出声音");
    }

}
