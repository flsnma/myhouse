package com.cxl.ch9.demo1;

public class Counter {
    private static Counter instance = null;
    int i;

    private Counter() {
    }

    public int getVisitorCount(){
        i++;
        return i;
    }

    public static Counter getInstance() {
        synchronized (Counter.class){
            if(instance==null){
                instance = new Counter();
            }
        }

        return instance;
    }

}
