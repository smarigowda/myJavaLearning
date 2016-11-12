package com.santosh;

class BMW extends Car {
    public BMW(String name, int cylinders) {
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

    @Override
    public void brake() {
        System.out.println(this.getClass().getName() + " -> Brake");
    }
}

