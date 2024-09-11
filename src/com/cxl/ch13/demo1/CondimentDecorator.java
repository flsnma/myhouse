package com.cxl.ch13.demo1;

public class CondimentDecorator extends Beverage {
    private Beverage beverage;

    public CondimentDecorator(Beverage beverage) {
        this.beverage = beverage;
    }

    public String getDecription() {
        return decription;
    }

    public double getCost() {
        return cost;
    }

}
