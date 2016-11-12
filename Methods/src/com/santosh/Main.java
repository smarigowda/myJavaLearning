package com.santosh;

public class Main {

    public static void main(String[] args) {

        int finalScore = calculateScore(true, 7000, 5, 100);
        System.out.println("Your final score was: " + finalScore);

        finalScore = calculateScore(true, 10000, 8, 200);
        System.out.println("Your final score was: " + finalScore);

        finalScore = calculateScore(false, 10000, 8, 200);
        System.out.println("Your final score was: " + finalScore);

        int position = calculateHighScorePosition(1500);
        displayHighScorePosition("Santosh", position);
        displayHighScorePosition("Sukruthi", calculateHighScorePosition(900));
        displayHighScorePosition("Roopa", calculateHighScorePosition(400));
        displayHighScorePosition("Samarth", calculateHighScorePosition(50));
    }

    public static int calculateScore(boolean gameOver, int score, int levelCompleted, int bonus) {

        if ( gameOver == true) {
            int finalScore = score + (levelCompleted * bonus);
            finalScore += 1000;
            return finalScore;
        } else return -1;
    }

    int position = calculateHighScorePosition(1500);

    public static void displayHighScorePosition(String playerName, int position) {
        System.out.println("Player " + playerName + " is at position: " + position + " On the high score table");
    }

    public static int calculateHighScorePosition(int score) {
        if (score >= 1000) { return 1; };
        if (score >=500 && score < 1000) { return 2; };
        if (score >= 100 && score < 500) { return 3; };
        return 4;
    }


}
