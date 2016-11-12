package com.company;

public class Main {

    public static void main(String[] args) {

        //width is 2 bytes, width = 2 bytes
	    char myChar = '\u00A9';
        System.out.println("unicode copyright = " + myChar);

        boolean myBoolean = true;
        boolean isMale = true;

        char myReg = '\u00AE';
        System.out.println("myReg = " + myReg);

    }
}
