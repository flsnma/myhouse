package com.cxl.qm.demo10;

public class Driver {
    private String name;
    void drive(Car car){
        System.out.print(name + "在开");
        car.run();
    }

    public Driver(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Driver{" +
                "name='" + name + '\'' +
                '}';
    }
}
