package com.cxl.ch11.demo2;

public class Client {
    public static void main(String[] args) {
        PaymentMethod cashPay = new CashPay();
        PaymentMethod wechatPay = new WechatPay();
        PaymentMethod facePay = new FacePay();

        Product paperBook = new PaperBook(cashPay, "散文精选");
        Product elecBook = new ElecBook(wechatPay, "java后端开发");
        Product coat = new Coat(facePay, "衬衫");

        paperBook.purchase();
        elecBook.purchase();
        coat.purchase();

        paperBook.setPaymentMethod(wechatPay);
        paperBook.purchase();
    }
}