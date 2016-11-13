package com.company;

import java.util.Scanner;

public class Main {

    private static Scanner scanner = new Scanner(System.in);
    private static int[] baseData = new int[10];



    public static void main(String[] args) {
	    getInput();
        printArray(baseData);
        resizeArray();
        System.out.println("Array resized to have 2 more elements:");
        baseData[10] = 10;
        baseData[11] = 11;
        printArray(baseData);
    }

    private static void getInput() {
        System.out.println("Enter " + baseData.length + " integers:");
        for(int i=0; i<baseData.length; i++) {
            baseData[i] = scanner.nextInt();
        }
    }

    private static void printArray(int[] array) {
        for(int i=0; i<baseData.length; i++) {
            System.out.print(baseData[i] + " ");
        }
        System.out.println();
    }

    private static void resizeArray() {
        int[] origiinal = baseData;
        baseData = new int[12];
        for(int i=0; i<origiinal.length; i++) {
            baseData[i] = origiinal[i];
        }
    }

}
