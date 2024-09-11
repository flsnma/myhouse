package com.cxl.qm.demo2;

public class HardDiskImp implements HardDisk{
    private int amount;

    public HardDiskImp(int amount) {
        this.amount = amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    @Override
    public int getAmount() {
        return amount;
    }
}
