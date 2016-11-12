package com.santosh;

public class Main {

    public static void main(String[] args) {
        int result = 1 + 2;
        System.out.println("1 + 2 = " + result);
        int previousResult = result;
        result = result - 1;
        System.out.println(previousResult + " -1 = " + result);

        result = result * 10;

        System.out.println(result + " *10 = " + result);

        boolean isAlean = false;
        if ( isAlean == true) {
            System.out.println("It is not an alean");
        }

        int topScore = 80;
        int secondTopScore = 78;

        if ( (topScore > secondTopScore) && (topScore < 100) ) {
            System.out.println("top score is greater than second");
        }

        if ( (topScore > 99 ) || (secondTopScore >= 90)) {
            System.out.println("or success");
        }

        int intValue = 50;
        if ( intValue == 50 ) {
            System.out.println("intvalue test");
        }

        boolean isCar = true;
        if (isCar == false) {
            System.out.println("Car is ..." + isCar);
        }

        boolean wasCar = isCar ? true: false;

        if ( wasCar ) {
            System.out.println("this was car");
        }

        double dValue1 = 20d;
        double dValue2 = 80d;
        double result2 = (dValue1 + dValue2) * 25;

        int remainder = (int) (result2 % 40);

        System.out.println(remainder);

        if ( remainder <= 20 ) {
            System.out.println("Total was over the limit");
        }

    }
}
