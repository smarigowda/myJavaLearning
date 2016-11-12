package com.santosh;

public class DeluxBurger extends Hamburger {
    public DeluxBurger() {
        super("Delux", "Sausage & Bacon", 14.54, "White");
        super.add1("Chips", 0);
        super.add2("Drink", 0);
    }

    @Override
    public void add1(String name, double price) {
        System.out.println("Can not add additional items to Delux");
    }

    @Override
    public void add2(String name, double price) {
        System.out.println("Can not add additional items to Delux");
    }

    @Override
    public void add3(String name, double price) {
        System.out.println("Can not add additional items to Delux");
    }

    @Override
    public void add4(String name, double price) {
        System.out.println("Can not add additional items to Delux");
    }
}
