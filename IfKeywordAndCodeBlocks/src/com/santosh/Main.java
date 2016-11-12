package com.santosh;

public class Main {

    public static void main(String[] args) {
	    boolean gameOver = true;
        int score = 1000;
        int levelCompleted = 5;
        int bonus = 100;

//        if(score == 5000) {
//            System.out.println("Your Score was 5000");
//        } else if ( score <= 3000) {
//            System.out.println("score is less than 3000");
//        }
//        else {
//            System.out.println("Your score is less...try again");
//        }
        if ( gameOver == true) {
            int finalScore = score + (levelCompleted * bonus);
            finalScore += 1000;
            System.out.println("Your final score was: " + finalScore);
        }

        // score of variables
        // int savedFinalScore = finalScore;

        score = 1000;
        levelCompleted = 3;
        bonus = 200;
        if(gameOver) {
            int finalScore = score + (levelCompleted * bonus);
            System.out.println("Your final score now is : " + finalScore);
        }

    }
}
