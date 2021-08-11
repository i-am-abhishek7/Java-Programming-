package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner((System.in));
        System.out.print("Enter the any number : ");
        int n = sc.nextInt();
	    int ans = sumDigit(n);
        System.out.println("The sum of Digit of number " + n + " is = " + ans);
    }

    public static int sumDigit(int number) {
        if(number < 10) {
            return -1;
        }
        int sum = 0;
        while(number > 0) {
            int digit = number % 10;
            sum += digit;
            number /= 10;
        }
        return sum;
    }
}
