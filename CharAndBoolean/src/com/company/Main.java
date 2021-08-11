package com.company;

public class Main {

    public static void main(String[] args) {

        char myChar = 'D';
        char myUnicodeChar = '\u0044';
        System.out.println(myChar);
        System.out.println(myUnicodeChar);
        char myCopyrightChar = '\u00A9';
        System.out.println(myCopyrightChar);

        System.out.println("----------------------------------");

        boolean myTrueBooleanValue = true;
        boolean myFalseBoolenaValue = false;
        System.out.println(myTrueBooleanValue);
        System.out.println(myFalseBoolenaValue);
        boolean isCustomerOverTwentryOne = true;
        System.out.println(isCustomerOverTwentryOne);
    }
}
