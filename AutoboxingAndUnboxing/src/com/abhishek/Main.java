package com.abhishek;

import java.util.ArrayList;

class IntClass {
    private int myValue;

    public IntClass(int myValue) {
        this.myValue = myValue;
    }

    public int getMyValue() {
        return this.myValue;
    }

    public void setMyValue() {
        this.myValue = myValue;
    }
}

public class Main {

    public static void main(String[] args) {
	    String[] strArray = new String[10];
	    int[] intArray = new int[10];

        ArrayList<String> stringArrayList = new ArrayList<String>();
        stringArrayList.add("Abhishek");

        ArrayList<IntClass> intClassArrayList = new ArrayList<IntClass>();
        intClassArrayList.add(new IntClass(54));

        ArrayList<Integer> integerArrayList = new ArrayList<Integer>();
//        for (int i = 0; i < 10; i++) {
//            integerArrayList.add(Integer.valueOf(i));
//        }
//
//        for (int i = 0; i < 10; i++) {
//            System.out.println(i + " --> " + integerArrayList.get(i).intValue());
//        }

        Integer myIntValue = 56; // in compile time converted into Integer.valueOf(56);
        int myInt = myIntValue; // myIntValue.intValue();

        ArrayList<Double> myDoubleValues = new ArrayList<Double>();
        for (double dbl = 0.0; dbl <= 10.0; dbl += 0.5) {
            myDoubleValues.add(Double.valueOf(dbl)); // converting the primitive type double(dbl) to the object wrapper(Double)
        }

        for(int i = 0; i < myDoubleValues.size(); i++) {
            double value = myDoubleValues.get(i).doubleValue();
            System.out.println(i + " --> " + value);
        }
    }
}
