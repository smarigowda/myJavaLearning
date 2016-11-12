package com.santosh;

public class Main {

    public static void main(String[] args) {
	    int count = 1;
        while (count != 6) {
            System.out.println("count = " + count);
            count++;
        }

        System.out.println("resetting the count...");
        count = 1;
        while (true) {
            if(count == 6) {
                break;
            }
            System.out.println("Count = " + count);
            count++;
        }

        System.out.println("resetting the count...");
        count = 1;
        do {
            System.out.println("count was: " + count);
            count++;
            if (count > 100) { break; }
        } while(count != 200);

        int number = 5;
        int finish = 10;
        int countEven = 0;
        while ( number <= finish) {
            number++;
            if(!isEven(number)) {
                continue;
            }
            countEven++;
            System.out.println("even number: " + number);
            if ( countEven == 5) {
                break;
            }
        }
        System.out.println("Total even numbers: " + countEven);

    }

    public static boolean isEven(int number) {

        if (number % 2 == 0) {
            return true;
        } else {
            return false;
        }
    }
}
