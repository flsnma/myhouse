package com.cxl.qm.demo8;

public class Test {
    public static void main(String[] args) {
        AbstractButton circleButton = new CircleButton();
        LoginFrom loginFrom = new LoginFrom(circleButton);
        loginFrom.displayForm();
    }
}
