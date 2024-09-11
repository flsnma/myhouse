package com.cxl.qm.demo4;

public class Test {
    public static void main(String[] args) {
        Single single = Single.getInstance();
        Single single1 = Single.getInstance();
        System.out.println(single == single1);
    }
}
