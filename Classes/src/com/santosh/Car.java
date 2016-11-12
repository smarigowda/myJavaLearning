package com.santosh;

// public -> unrestricted access
// other classes have access

// encapsulation, hide internals

public class Car {
    // states
    private int doors;
    private int wheels;
    private String model;
    private String engine;
    private String color;

    public void setModel(String model) {
        String validModel = model.toLowerCase();

        // data validation
        if(validModel.equals("carrera") || validModel.equals("holden")) {
            this.model = model;
        } else {
            System.out.println("model is not valid");
        }
    }

    public String getModel() {
        return this.model;
    }
}
