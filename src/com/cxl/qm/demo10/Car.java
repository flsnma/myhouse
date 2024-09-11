package com.cxl.qm.demo10;

public class Car {
    private String carname;
    public void run(){
        System.out.println(carname + "车在奔驰");
    }

    public Car(String carname) {
        this.carname = carname;
    }

    public String getCarname() {
        return carname;
    }

    public void setCarname(String carname) {
        this.carname = carname;
    }

    @Override
    public String toString() {
        return "Car{" +
                "carname='" + carname + '\'' +
                '}';
    }
}
