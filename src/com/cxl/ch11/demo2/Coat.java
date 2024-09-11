package com.cxl.ch11.demo2;

class Coat extends Product {
    public Coat(PaymentMethod paymentMethod, String productName) {
        super(paymentMethod, productName);
    }

    @Override
    public void purchase() {
        System.out.print("购买" + productName+",");
        paymentMethod.payMoney();
    }
}