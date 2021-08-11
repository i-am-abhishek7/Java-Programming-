package com.abhishek;

import java.util.Scanner;

public class Main {

    private static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("Enter the size of an array.\r");
        int n = sc.nextInt();
        int[] arr = getIntegerValue(n);
        System.out.println("Non reversed array.\r");
        printArray(arr);
        System.out.println();
        System.out.println("Reversed array.\r");
        reverseArray(arr);
        printArray(arr);
    }

    public static void reverseArray(int[] arr) {
        int start = 0;
        int end = arr.length - 1;
        while (start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }

    public static void printArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public static int[] getIntegerValue(int n) {
        System.out.println("Enter the elements in an array.\r");
        int[] newArr = new int[n];
        for(int i = 0; i < newArr.length; i++) {
            newArr[i] = sc.nextInt();
        }
        return newArr;
    }
}
