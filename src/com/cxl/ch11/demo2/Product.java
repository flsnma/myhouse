package com.cxl.ch11.demo2;

abstract class Product {
    protected PaymentMethod paymentMethod;
    protected String productName;

    public Product(PaymentMethod paymentMethod, String productName) {
        this.paymentMethod = paymentMethod;
        this.productName = productName;
    }
    public abstract void purchase();

    public void setPaymentMethod(PaymentMethod paymentMethod) {
        this.paymentMethod = paymentMethod;
    }
}