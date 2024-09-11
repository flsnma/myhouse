package com.cxl.ch11.demo2;

class WechatPay implements PaymentMethod {
    @Override
    public void payMoney() {
        System.out.println("使用微信支付");
    }
}
