package com.cxl.qm.demo4;

public class Single {
    private static Single instance = null;
    private Single() {
    }
    public static Single getInstance(){
        if(instance == null){
            instance = new Single();
        }
        return instance;
    }
}
