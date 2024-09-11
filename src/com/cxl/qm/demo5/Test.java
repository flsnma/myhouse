package com.cxl.qm.demo5;

public class Test {
    public static void main(String[] args) {
        payMethodFactory cashPayFactory = new CashPayFactory();
        AbstractPay cashPay = cashPayFactory.payMethod();
        cashPay.payMoney();

        System.out.println("支付额度不够，转微信支付");
    }
}
