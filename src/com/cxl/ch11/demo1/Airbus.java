package com.cxl.ch11.demo1;

public class Airbus extends Manufacturer {
    @Override
    public void make() {
        String planeType = "空客飞机制造商制造";
        this.plane.fly(planeType);
    }
}
