package com.cxl.ch13.demo1;

public class StarBuzzCoffee {
    public static void main(String[] args) {
        Beverage espresso = new Espresso();
        System.out.println(espresso.getDecription());
        System.out.println(espresso.getCost());
        System.out.println("----------------------------");
        Mocha mocha = new Mocha(espresso);
        Milk milk = new Milk(mocha);
        System.out.println(milk.getDecription());
        System.out.println(milk.getCost());
    }
}
