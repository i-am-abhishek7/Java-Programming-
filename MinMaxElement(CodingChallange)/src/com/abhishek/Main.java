package com.abhishek;

import java.util.Scanner;

// The time complexity of this code is O(N)

class Pair {
    public int min = Integer.MAX_VALUE;
    public int max = Integer.MIN_VALUE;

    public static Pair getMinMax(int[] arr, int n) {
        Pair pair = new Pair();
        if(n == 1) {
            pair.min = arr[0];
            pair.max = arr[0];
        }

        if(n == 2) {
            if(arr[0] > arr[1]) {
                pair.max = arr[0];
                pair.min = arr[1];
            } else {
                pair.max = arr[1];
                pair.min = arr[0];
            }
        }

        for (int i = 0; i < n; i++) {
            if(arr[i] > pair.max) {
                pair.max = arr[i];
            } else if(arr[i] < pair.min) {
                pair.min = arr[i];
            }
        }
        return pair;
    }
}

public class Main {

    private static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Enter the size of an array: \r");
        int n = sc.nextInt();
        int[] arr = getInputArray(n);
        Pair pair = Pair.getMinMax(arr, n);
        System.out.println("\nMinimum Element is " + pair.min);
        System.out.println("\nMaximum Element is " + pair.max);
    }

    public static int[] getInputArray(int n) {
        int[] newArray = new int[n];
        System.out.println("Enter the value in an array: ");
        for(int i = 0; i < newArray.length; i++) {
            newArray[i] = sc.nextInt();
        }
        return newArray;
    }
}
