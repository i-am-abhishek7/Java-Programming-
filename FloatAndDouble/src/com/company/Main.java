package com.company;

public class Main {

    public static void main(String[] args) {
	    
        float myMinFloatValue = Float.MIN_VALUE;
        float myMaxFloatValue = Float.MAX_VALUE;
        System.out.println("Float MIN Value " + myMinFloatValue);
        System.out.println("Float MAX Value " + myMaxFloatValue);

        System.out.println("-------------------------------------");

        double myMinDoubleValue = Double.MIN_VALUE;
        double myMaxDoubleValue = Double.MAX_VALUE;
        System.out.println("Double MIN Value " + myMinDoubleValue);
        System.out.println("Double MAX Value " + myMaxDoubleValue);

        System.out.println("--------------------------------------");

        int myIntValue = 5 / 3;
        float myFloatValue = 5f / 3f;
        double myDoubleValue = 5d / 3d;
        System.out.println("MyIntValue = " + myIntValue);
        System.out.println("MyFloatValue = " + myFloatValue);
        System.out.println("MyDoubleValue = " + myDoubleValue);

        System.out.println("--------------------------------------");

        double numberOfPounds = 200;
        double convertedKilograms = (numberOfPounds * 0.45359237);
        System.out.println("Pound Convert into Kilogram = " + convertedKilograms);
    }
}
