package com.cxl.qm.demo2;

public class Test {
    public static void main(String[] args) {
        CpuImp cpuImp = new CpuImp(3200);
        HardDiskImp hardDiskImp = new HardDiskImp(1024 * 1024);
        Computer computer = new Computer(cpuImp, hardDiskImp);
        computer.display();
    }
}
