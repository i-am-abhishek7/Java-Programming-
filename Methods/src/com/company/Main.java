package com.company;

public class Main {

    public static void main(String[] args) {
        /*
        int highScore = calculateScore(true, 800, 5, 100);
        System.out.println("Your final score is " + highScore);
        highScore = calculateScore(false, 1000, 6, 90);
        System.out.println("Your final score is " + highScore);
        */
        int highScorePosition = calculateHighScorePosition(1500);
        displayHighScorePosition("Abhishek", highScorePosition);

        highScorePosition = calculateHighScorePosition(900);
        displayHighScorePosition("Priyanshu", highScorePosition);

        highScorePosition = calculateHighScorePosition(400);
        displayHighScorePosition("Kishor", highScorePosition);

        highScorePosition = calculateHighScorePosition(50);
        displayHighScorePosition("Hariom", highScorePosition);
    }

    public  static void displayHighScorePosition(String playerName, int highScorePosition) {
        System.out.println(playerName + " managed to get into position " + highScorePosition
        + " on the high score table");
    }

    public  static int calculateHighScorePosition(int playerScore) {
        /*
        if(playerScore >= 1000) {
            return 1;
        } else if(playerScore >= 500) {
            return 2;
        } else if (playerScore >= 100) {
            return 3;
        }
        return 4;
       */

        int position = 4; // assuming position 4 will be returned
        if(playerScore >= 1000) {
            position = 1;
        } else if (playerScore >= 500) {
            position = 2;
        } else if (playerScore >= 100) {
            position = 3;
        }
        return position;
    }

    public static  int calculateScore(boolean gameOver, int score, int levelCompleted, int bonus) {
        if(gameOver) {
            int finalScore = score + (levelCompleted * bonus);
            finalScore += 2000;
            return finalScore;
        }
        return -1;
    }
}
