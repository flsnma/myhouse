package com.cxl.qm.demo2;

public class CpuImp implements Cpu {
    private int speed;

    public CpuImp(int speed) {
        this.speed = speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    @Override
    public int getSpeed() {
        return speed;
    }
}
