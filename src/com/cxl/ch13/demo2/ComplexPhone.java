package com.cxl.ch13.demo2;

public class ComplexPhone extends PhoneDecorator {
    public ComplexPhone(Cellphone phone) {
        super(phone);
    }

    @Override
    void receiveCall() {
        System.out.println("灯光闪烁提示");
    }

}
