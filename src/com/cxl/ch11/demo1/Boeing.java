package com.cxl.ch11.demo1;

public class Boeing extends Manufacturer {
    @Override
    public void make() {
        String planeType = "波音飞机制造商制造";
        this.plane.fly(planeType);
    }
}
