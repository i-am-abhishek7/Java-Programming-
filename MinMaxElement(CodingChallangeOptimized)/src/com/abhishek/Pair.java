package com.abhishek;

public class Pair {
    public int min = Integer.MAX_VALUE;
    public int max = Integer.MIN_VALUE;

    public static Pair getMinMax(int[] arr, int low, int high) {
        Pair minMax = new Pair();
        Pair minMaxLeft = new Pair();
        Pair minMaxRight = new Pair();

        if(low == high) {
            minMax.min = arr[low];
            minMax.max = arr[low];
            return minMax;
        }

        if(high == low + 1) {
            if(arr[low] > arr[high]) {
                minMax.max = arr[low];
                minMax.min = arr[high];
            } else {
                minMax.max = arr[high];
                minMax.min = arr[low];
            }
            return minMax;
        }

        int mid = ((low + high) / 2);
        minMaxLeft = getMinMax(arr, low, mid);
        minMaxRight = getMinMax(arr, mid + 1, high);

        // Comparing minimums of two parts
        if(minMaxLeft.min < minMaxRight.min) {
            minMax.min = minMaxLeft.min;
        } else {
            minMax.min = minMaxRight.min;
        }

        // Comparing maximums of two parts
        if(minMaxLeft.max < minMaxRight.max) {
            minMax.max = minMaxRight.max;
        } else {
            minMax.max = minMaxLeft.max;
        }
        return minMax;
    }
}
