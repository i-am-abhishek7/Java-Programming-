package com.abhishek;

import java.util.Scanner;

public class Main {

    private static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("Enter the the size of an array.\r");
        int n = sc.nextInt();
        int[] arr = readIntegers(n);
        System.out.println("Given array is: \r");
        printArray(arr);
        System.out.println();
        int minElement = getMinElement(arr);
        System.out.println("The minimum element in an array is: " + minElement);
    }

    public static int getMinElement(int[] arr) {
        int minElement = Integer.MAX_VALUE;
        for(int i = 0; i < arr.length; i++) {
            if(arr[i] < minElement) {
                minElement = arr[i];
            }
        }
        return minElement;
    }

    public static int[] readIntegers(int n) {
        System.out.println("Enter the element in an array.\r");
        int[] readArray = new int[n];
        for(int i = 0; i < readArray.length; i++) {
            readArray[i] = sc.nextInt();
        }
        return readArray;
    }

    public static void printArray(int[] arr) {
        for(int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
