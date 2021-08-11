package com.company;

public class Main {

    public static void main(String[] args) {

        int result = 1 + 2; // 1 + 2 = 3
        System.out.println("1 + 2 = " + result);
        int previousResult = result;

        System.out.println("---------------------------------------");

        System.out.println("Previous Result = " + previousResult);

        result = result - 1;

        System.out.println("---------------------------------------");

        System.out.println("3 - 1 = " + result);

        System.out.println("---------------------------------------");

        System.out.println("Previous Result = " + previousResult);

        System.out.println("---------------------------------------");

        result = result * 10;
        System.out.println("2 * 10 = " + result);

        System.out.println("---------------------------------------");

        result = result / 5;
        System.out.println("20 / 5 = " + result);

        System.out.println("---------------------------------------");

        result = result % 3;
        System.out.println("4 % 3 = " + result);

        System.out.println("---------------------------------------");

        result++;
        System.out.println("1 + 1 = " + result);

        System.out.println("---------------------------------------");

        result--;
        System.out.println("2 - 1 = " + result);

        System.out.println("---------------------------------------");

        result += 2;
        System.out.println("1 + 2 = " + result);

        System.out.println("---------------------------------------");

        result *= 10;
        System.out.println("3 * 10 = " + result);

        System.out.println("---------------------------------------");

        result /= 3;
        System.out.println("30 / 3 = " + result);

        System.out.println("---------------------------------------");

        result -= 2;
        System.out.println("10 - 2 = " + result);

        System.out.println("---------------------------------------");

        boolean isAlien = false;
        if(isAlien == false) {
            System.out.println("It is not an alien!");
        }

        System.out.println("---------------------------------------");

        System.out.println("And I am scared of aliens!");

        System.out.println("---------------------------------------");

        int topScore = 80;
        if(topScore >= 100) {
            System.out.println("You got the high score!");
        }

        System.out.println("---------------------------------------");

        int secondTopScore = 60;
        if((topScore > secondTopScore) && (topScore < 100)) {
            System.out.println("Greater than second top score and less than 100");
        }

        System.out.println("---------------------------------------");

        if((topScore > 90) || (secondTopScore <= 90)) {
            System.out.println("Either or both of the condition are true");
        }

        System.out.println("---------------------------------------");

        int newValue = 50;
        if(newValue == 50) {
            System.out.println("This is true!");
        }

        System.out.println("---------------------------------------");

        boolean isCar = false;
        if(!isCar) {
            System.out.println("This is not suppose to happen!");
        }

        System.out.println("---------------------------------------");

        boolean wasCar = isCar ? true : false;
        System.out.println("Was Car = " + wasCar);
    }
}
