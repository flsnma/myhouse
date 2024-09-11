package com.cxl.ch11.demo1;

public class McDonnellDouglas extends Manufacturer{
    @Override
    public void make() {
        String planeType = "麦道飞机制造商制造";
        this.plane.fly(planeType);
    }
}
