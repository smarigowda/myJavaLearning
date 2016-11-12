package com.santosh;

public class Hamburger {
    private String name;
    private String meat;
    private double price;
    private String breadRollType;

    private String add1Name;
    private double add1Price;

    private String add2Name;
    private double add2Price;

    private String add3Name;
    private double add3Price;

    private String add4Name;
    private double add4Price;

    public void add1(String name, double price) {
        this.add1Name = name;
        this.add1Price = price;
    }

    public void add2(String name, double price) {
        this.add2Name = name;
        this.add2Price = price;
    }

    public void add3(String name, double price) {
        this.add3Name = name;
        this.add3Price = price;
    }

    public void add4(String name, double price) {
        this.add4Name = name;
        this.add4Price = price;
    }

    public Hamburger(String name, String meat, double price, String breadRollType) {
        this.name = name;
        this.meat = meat;
        this.price = price;
        this.breadRollType = breadRollType;
    }

    public double itemizeHamburger() {

        double hamburgerPrice = this.price;
        System.out.println(this.name + " Hamburger on bread roll " + this.breadRollType +  " with meat " + this.meat + " -- base price = " + this.price);

        if(add1Name != null) {
            hamburgerPrice += this.add1Price;
            System.out.println("Added " + this.add1Name + " for an extra price of " + this.add1Price);
        }

        if(add2Name != null) {
            hamburgerPrice += this.add2Price;
            System.out.println("Added " + this.add2Name + " for an extra price of " + this.add2Price);
        }

        if(add3Name != null) {
            hamburgerPrice += this.add3Price;
            System.out.println("Added " + this.add3Name + " for an extra price of " + this.add3Price);
        }

        if(add4Name != null) {
            hamburgerPrice += this.add4Price;
            System.out.println("Added " + this.add4Name + " for an extra price of " + this.add4Price);
        }

        return hamburgerPrice;
    }

}
