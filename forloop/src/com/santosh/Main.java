package com.santosh;

public class Main {

    public static void main(String[] args) {
        System.out.println(calculateInterest(1000, 10));
        System.out.println(calculateInterest(1000, 2));
        System.out.println(calculateInterest(1000, 5));
        System.out.println(calculateInterest(1000, 4));

        for(int i = 2; i <=8; i++) {
            System.out.println("loop " + i);
            System.out.println("interest = " + String.format("%.2f", calculateInterest(10000, i)));
        }

        for(int i = 8; i >=2; i--) {
            System.out.println("loop " + i);
            System.out.println("interest = " + String.format("%.2f", calculateInterest(10000, i)));
        }

        int range = 100;
        int count = 0;
        for(int i = 0; i < range; i++) {
            if(isPrime(i)) {
                count++;
                System.out.println( i + " is prime..");
            }

            if(count == 3) {
                System.out.println("three prime numbers found, exiting the loop");
                break;
            }
        }
    }

    public static double calculateInterest(double amount, double interestRate) {
        return (amount * (interestRate/100));
    }

    public static boolean isPrime(int n) {

        if (n == 1) { return false; }

//        for (int i = 2; i <= n/2; i++) {
            for (int i = 2; i <= (long) Math.sqrt(n); i++) {
                if(n % i == 0) { return false; }
            }

        return true;

    }


}
