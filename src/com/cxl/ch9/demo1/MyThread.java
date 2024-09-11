package com.cxl.ch9.demo1;

public class MyThread implements Runnable{

    @Override
    public void run() {
        Counter counter = null;
        counter = counter.getInstance();
        synchronized (MyThread.class){
            System.out.println("您是本站的第"+counter.getVisitorCount()+"位访客");
        }
    }
}
