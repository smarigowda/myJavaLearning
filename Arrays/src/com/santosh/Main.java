package com.santosh;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	    int[] myIntArray = new int[24];
        myIntArray[5] = 10;

        int[] myIntArray2  = { 10, 12, 13, 14, 15, 16, 19, 20, 11, 11 ,11 , 11, 11 };

        double[] myDoubleArray = new double[10];
        System.out.println(myIntArray[5]);
        System.out.println(myIntArray2[10]);

        for(int i = 0; i < myIntArray.length; i++) {
            myIntArray[i] = i * 10;
        }

        printArray(myIntArray);

        int[] myIntegers = getIntegers(5);
        printArray(myIntegers);
        System.out.println("Average is: " + getAverage(myIntegers));

    }

    public static int[] getIntegers(int number) {
        System.out.println("Enter " + number + " integer values.\r");
        int[] values = new int[number];
        for(int i=0; i<values.length; i++) {
            values[i] = scanner.nextInt();
        }
        return values;
    }


    public static void printArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.println("element " + i + " value " + array[i]);
        }
    }

    private static Scanner scanner = new Scanner(System.in);

    public static double getAverage(int[] array) {
        int sum = 0;
        for(int i=0; i<array.length; i++) {
            sum += array[i];
        }
        return (double) sum/ (double) array.length;
    }
}
