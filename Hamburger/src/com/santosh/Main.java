package com.santosh;

public class Main {

    public static void main(String[] args) {
//        Hamburger hb = new Hamburger("Basic", "Sausage", 3.56, "White");
//        hb.add1("Tomato", 0.34);
//        hb.add2("Lettuce", 0.56);
//        hb.add3("Cheese", 0.98);
//        double totalPrice = hb.itemizeHamburger();
//        System.out.println("Total price = " + totalPrice);

//        HealthyBurger hlb = new HealthyBurger("Bacon", 6.98);
//        hlb.add1("Egg", 3.8);
//        hlb.addHealthy1("Lentils", 1.7);
//        double totalPrice = hlb.itemizeHamburger();
//        System.out.println("Total price = " + totalPrice);

        DeluxBurger delb = new DeluxBurger();
        delb.itemizeHamburger();
        delb.add1("Tomato", 3.4);
    }


}
