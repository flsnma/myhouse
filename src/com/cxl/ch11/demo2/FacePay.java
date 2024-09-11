package com.cxl.ch11.demo2;

class FacePay implements PaymentMethod {
    @Override
    public void payMoney() {
        System.out.println("使用人脸支付");
    }
}