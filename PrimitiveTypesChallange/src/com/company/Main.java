package com.company;

public class Main {

    public static void main(String[] args) {
        byte myByteVariable = 10;
        short myShortVariable = 20;
        int myIntVariable = 50;
        long myLongVariable = 50000L + 10L * (myByteVariable + myShortVariable + myIntVariable);
        System.out.println(myLongVariable);

        short shortTotal = (short) (1000 + 10 * (myByteVariable + myShortVariable + myIntVariable));
        System.out.println(shortTotal);
    }
}
