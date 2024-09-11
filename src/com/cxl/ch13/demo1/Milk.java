package com.cxl.ch13.demo1;

public class Milk extends CondimentDecorator {
    Beverage beverage;
    public Milk(Beverage beverage) {
        super(beverage);
        this.beverage =beverage;
    }
    public String getDecription() {
        return beverage.getDecription()+"+milk";
    }

    public double getCost() {
        return beverage.getCost()+6;
    }

}
