package com.cxl.qm.demo5;

public class WeiXinPayFactory implements payMethodFactory {
    @Override
    public AbstractPay payMethod() {
        return new WeiXi();
    }
}
