package com.abhishek;

import java.util.Scanner;

public class Main {

    private static Scanner sc = new Scanner(System.in);
    private static Pair pair = new Pair();

    public static void main(String[] args) {
        System.out.println("Enter the size of an array: \r");
        int n = sc.nextInt();
        int[] arr = getInputArray(n);

        Pair minMax = Pair.getMinMax(arr, 0, n - 1);
        System.out.println("\nMinimum Element is " + minMax.min);
        System.out.println("\nMaximum Element is " + minMax.max);
    }

    private static int[] getInputArray(int n) {
        int[] newArray = new int[n];
        System.out.println("Enter the element in an array: \r");
        for (int i = 0; i < newArray.length; i++) {
            newArray[i] = sc.nextInt();
        }
        return newArray;
    }
}
