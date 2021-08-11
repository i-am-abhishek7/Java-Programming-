package com.company;

public class Main {

    public static void main(String[] args) {
	    String numberAsString = "2021.125";
        System.out.println("Number as String = " + numberAsString);

        double number = Double.parseDouble(numberAsString);
        System.out.println("Number = " + number);

        numberAsString += 1;
        number += 1;

        System.out.println("numberAsString = " + numberAsString);
        System.out.println("number = " + number);
    }
}
