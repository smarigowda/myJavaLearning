package com.santosh;

public class Main {

    public static void main(String[] args) {
	    int switchValue = 3;

        switch(switchValue) {
            case 1:
                System.out.println("value was 1");
                break;
            case 2:
                System.out.println("value was 2");
                break;
            case 3: case 4: case 5:
                System.out.println("value was 3 or 4 or 5");
                System.out.println("Actual value was " + switchValue);
                break;
            default:
                System.out.println("default case");
                break;
        }

        char charValue = 'D';

        switch(charValue) {
            case 'A':
                System.out.println("char is A");
                break;
            case 'B':
                System.out.println("char is B");
                break;
            case 'C':
                System.out.println("char is C");
                break;
            default:
                System.out.println("char is not A, B or C");
                break;
        }

        String month = "January";
        switch(month.toLowerCase()) {
            case "january":
                System.out.println("month is January");
        }
    }
}
