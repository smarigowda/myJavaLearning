package com.company;

public class Main {

    public static void main(String[] args) {
        // width = 32, 4 bytes
	    int myIntValue = 5 / 2;

        // width = 32, 4 bytes
        float myFloatValue = 5f / 3f;

        // width = 64, 8 bytes
        double myDoubleValue = 5d / 3d;

        System.out.println("myIntvalue = " + myIntValue);
        System.out.println("myFloatValue = " + myFloatValue);
        System.out.println("myDoubleValue = " + myDoubleValue);

        double conversion = 0.45359237;
        double pounds = 200d;
        double kg = pounds * conversion;

        System.out.println("kg = " + kg);

        double pi = 3.14159d;

    }
}
