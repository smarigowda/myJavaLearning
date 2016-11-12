package com.santosh;


public class Main {

    public static void main(String[] args) {

	    // objects have
        // 1. state ( in variables )
        // 2. behaviour (methods)

        // class - blue print for objects
        // class can be thought of a user defined type

        Car porsche = new Car();
        Car holden = new Car();

//        porsche = null;
        System.out.println("model is: " + porsche.getModel());
        porsche.setModel("Carrera");
        porsche.setModel("922");
        System.out.println("model is: " + porsche.getModel());

    }
}
