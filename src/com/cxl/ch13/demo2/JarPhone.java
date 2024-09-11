package com.cxl.ch13.demo2;

public class JarPhone extends PhoneDecorator {

    public JarPhone(Cellphone phone) {
        super(phone);
    }


    @Override
    void receiveCall() {
        super.receiveCall();
        System.out.println("产生振动");
    }

}
