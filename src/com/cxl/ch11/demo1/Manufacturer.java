package com.cxl.ch11.demo1;

public abstract class Manufacturer {
    protected Plane plane;

    public void setPlane(Plane plane) {
        this.plane = plane;
    }

    public abstract void make();
}
