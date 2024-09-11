package com.cxl.ch13.demo1;

public class Mocha extends CondimentDecorator {
    Beverage beverage;
    public Mocha(Beverage beverage) {
        super(beverage);
        this.beverage =beverage;
    }
    public String getDecription() {
        return beverage.getDecription()+"+mocha";
    }

    public double getCost() {
        return beverage.getCost()+10;
    }

}
