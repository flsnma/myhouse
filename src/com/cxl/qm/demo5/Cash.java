package com.cxl.qm.demo5;

public class Cash implements AbstractPay{
    @Override
    public void payMoney() {
        System.out.println("现金支付");
    }
}
