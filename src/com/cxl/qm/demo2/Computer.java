package com.cxl.qm.demo2;

public class Computer {
    private CpuImp cpu;
    private HardDiskImp hardDisk;

    public Computer(CpuImp cpu, HardDiskImp hardDisk) {
        this.cpu = cpu;
        this.hardDisk = hardDisk;
    }
    public void display(){
        System.out.println(cpu.getSpeed());
        System.out.println(hardDisk.getAmount());
    }


}
