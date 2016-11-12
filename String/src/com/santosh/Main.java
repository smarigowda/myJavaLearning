package com.santosh;

public class Main {

    public static void main(String[] args) {
	    // String, sequence of characters

        String myString = "This is a string";

        myString = myString + "...adding to end";
        System.out.println("this is my string " + myString);

        myString = myString + "  \u00A9 2016";
        System.out.println(myString);

        String myNumberString = "497987.999";
        myNumberString = myNumberString + "78787";

        System.out.println("result is " + myNumberString);

        String lastString = "50";
        int myInt = 89;
        lastString = lastString + myInt;

        System.out.println("my lastString = " + lastString);

        double myDouble = 120.57d;
        lastString = lastString + myDouble;
        System.out.println("my lastString = " + lastString);

    }
}
