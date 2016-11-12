package com.company;

public class Main {

    public static void main(String[] args) {
        byte myByte = 122;
        short myShort = 122;
        int myInt = 12345;
        long myLong = (50000L + 10L) * (myByte + myShort + myInt);
        short myShortTotal = (short) ((50000 + 10) * (myByte + myShort + myInt));
        System.out.println("myLong = " + myLong);
        System.out.println("myShortTotal = " + myShortTotal);
    }
}