package com.abhishek;

public class Main {

    public static void main(String[] args) {
	    SimpleCalculator calculator = new SimpleCalculator(5.0, 4.0);
        System.out.println("Addition of Number is: "  + calculator.getAdditionResult());
        System.out.println("Subtraction of Number is: " + calculator.getSubtractionResult());
        System.out.println("Multiplication of Number is: " + calculator.getMultiplicationResult());
        System.out.println("Division of Number is: " + calculator.getDivisionResult());
    }
}
