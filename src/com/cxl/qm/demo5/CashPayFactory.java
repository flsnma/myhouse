package com.cxl.qm.demo5;

public class CashPayFactory implements payMethodFactory {
    @Override
    public AbstractPay payMethod() {
        return new Cash();
    }
}
