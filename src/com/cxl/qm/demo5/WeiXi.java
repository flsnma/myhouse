package com.cxl.qm.demo5;

public class WeiXi implements AbstractPay {
    @Override
    public void payMoney() {
        System.out.println("weixin支付");
    }
}
