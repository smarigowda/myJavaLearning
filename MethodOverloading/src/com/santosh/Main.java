package com.santosh;

public class Main {

    public static void main(String[] args) {
	    int newScore = calculateScore("Santosh", 500);
        System.out.println("New score is: " + newScore);
        calculateScore(100);
        calculateScore();

        double centis = calcFeetAndInchesToCentimeters(12, 13);

        if ( centis < 0) {
            System.out.println("Invalid feet or inches");
        } else {
            System.out.println("centis = " + centis);
        }

        centis = calcFeetAndInchesToCentimeters(12);

        if ( centis < 0) {
            System.out.println("Invalid feet or inches");
        } else {
            System.out.println("centis = " + centis);
        }

    }

    public static int calculateScore(String playerName, int score) {
        System.out.println("Player " + playerName + " scored " + score + " points");
        return score*1000;
    }

    public static int calculateScore(int score) {
        System.out.println("Unnamed Player scored " + score + " points");
        return score*1000;
    }

    public static void calculateScore() {
        System.out.println("No player, No score");
    }


    public static double calcFeetAndInchesToCentimeters(double feet, double inches) {
        if ( !(feet>=0) ) { return -1; }
        if ( !(inches >= 0 && inches <= 12)) { return -1; }
        double centis = feet * 12 * 2.54 + inches * 2.54;
        return centis;
    }

    public static double calcFeetAndInchesToCentimeters(double inches) {
        if (!(inches >= 0)) { return -1; }
        double feets = (int) inches / 12;
        inches = inches % 12;
        double centis = calcFeetAndInchesToCentimeters(feets, inches);
        return centis;
    }
}
