package com.santosh;

public class Main {

    public static void main(String[] args) {
        Car ford = new Ford();
        ford.startEngine();
        ford.accelerate();
        ford.brake();

        Car tesla = new Tesla("Tesla Car", 4);
        tesla.startEngine();
        tesla.accelerate();

        Car defaultCar = new DefaultCar();
        defaultCar.startEngine();

        Car bmw = new BMW("BMW", 7);
        bmw.startEngine();
        bmw.accelerate();
        bmw.brake();
    }
}

class Car {

    private String name;
    private boolean engine;
    private int cylinders;
    private int wheels;

    public Car(String name, int cylinders) {
        this.name = name;
        this.cylinders = cylinders;
        this.wheels = 4;
        this.engine = true;
    }

    public String getName() {
        return name;
    }

    public boolean isEngine() {
        return engine;
    }

    public int getCylinders() {
        return cylinders;
    }

    public int getWheels() {
        return wheels;
    }

    public void startEngine() {
        System.out.println("Car -> Engine started. default car!");
    }

    public void accelerate() {
        System.out.println("Car -> Acceleration");
    }

    public void brake() {
        System.out.println("Car -> Brake");
    }
}

class Ford extends Car {
    public Ford() {
        super("Ford", 2);
    }

    @Override
    public void startEngine() {

        System.out.println("Ford -> Starting engine");
    }
}

class Tesla extends Car {
    public Tesla(String name, int cylinders) {
        super(name, cylinders);
    }

    @Override
    public void startEngine() {
        System.out.println(this.getName() + " -> Starting engine");
    }

    @Override
    public void accelerate() {
        System.out.println(this.getName() + " -> Accelerate");
    }
}

class Toyota extends Car {

    public Toyota() {
        super("Toyota", 3);
    }

    @Override
    public void startEngine() {
        System.out.println(this.getName() + " - > Starting engine");
    }
}

class DefaultCar extends Car {
    public DefaultCar() {
        super("DefaultCar", 1);
    }

    @Override
    public void startEngine() {
        super.startEngine();
    }
    // no start engine override here
}