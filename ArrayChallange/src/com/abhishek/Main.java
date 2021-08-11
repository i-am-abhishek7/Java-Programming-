package com.abhishek;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    private static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
	    int[] myArray = getIntegers(5);
        System.out.println("Array before sort.\r");
	    printArray(myArray);
        System.out.println();
	    int[] sortedArray = getSortedArray(myArray);
        System.out.println("Array after sort.\r");
        printArray(sortedArray);
    }

    public static int[] getSortedArray(int[] array) {
        int[] sortedArray = Arrays.copyOf(array, array.length);
        boolean flag = true;
        int temp;
        while(flag) {
            flag = false;
            for (int i = 0; i < sortedArray.length - 1; i++) {
                if(sortedArray[i] > sortedArray[i+1]) {
                    temp = sortedArray[i];
                    sortedArray[i] = sortedArray[i+1];
                    sortedArray[i+1] = temp;
                    flag = true;
                }
            }
        }
        return sortedArray;
    }

    public static int[] getIntegers(int number) {
        System.out.println("Enter the " + number + " element.\r");
        int[] values = new int[number];
        for (int i = 0; i < values.length; i++) {
            values[i] = sc.nextInt();
        }
        return values;
    }

    public static void printArray(int[] array) {
        for(int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
    }
}
