package com.cxl.ch9.demo1;

public class Client {
    public static void main(String[] args) {
        Runnable runnable = new MyThread();
        for(int i=0; i<100; i++){
            Thread thread = new Thread(runnable);
            thread.start();
        }
    }
}
