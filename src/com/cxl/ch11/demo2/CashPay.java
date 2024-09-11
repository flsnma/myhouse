package com.cxl.ch11.demo2;

class CashPay implements PaymentMethod {
    @Override
    public void payMoney() {
        System.out.println("使用现金支付");
    }
}