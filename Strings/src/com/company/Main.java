package com.company;

public class Main {

    public static void main(String[] args) {
        String myString = "This is String";
        System.out.println("My String is Equal to " + myString);
        myString = myString + ", and this is more!";
        System.out.println("My String is Equal to " + myString);
        myString = myString + " \u00A9 2021";
        System.out.println("My String is Equal to " + myString);

        String numberString = "250.55";
        numberString = numberString + "49.95";
        System.out.println(numberString);
        String lastString = "10";
        int myInt = 50;
        lastString = lastString + myInt;
        System.out.println("Last String is equal to " + lastString);

        double doubleNumber = 120.47d;
        lastString = lastString + doubleNumber;
        System.out.println("Last String is equal to " + lastString);
    }
}
