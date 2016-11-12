package com.santosh;

public class Main {

    public static void main(String[] args) {
	    Printer printer = new Printer(50, true);
        System.out.println("initial page count = " + printer.getPagesPrinted());

        int pagesPrinted = printer.printPages(4);
        System.out.println("Pages printed now is: " + pagesPrinted);
        System.out.println("Total pages printed so far is: " + printer.getPagesPrinted());

        pagesPrinted = printer.printPages(4);
        System.out.println("Pages printed now is: " + pagesPrinted);
        System.out.println("Total pages printed so far is: " + printer.getPagesPrinted());
    }
}
