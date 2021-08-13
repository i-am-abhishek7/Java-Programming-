package com.abhishek;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	    /* Create a simple interface
            That interface allows an object to be saved to some sort of storage medium. (tip: use arrayList)
            The exact type of medium is not known to the interface (nor the classes that implement it)
            The interface will just specify two methods, one to return an ArrayList of values to be saved
            and the other to populate the object's fields from an ArrayList (parameter).

            Create a few sample classes that implements you Savable interface .

            Override the toString() method for each of your classes so that they can be easily printed to
            enable the program to be tested easier.

            In Main, write a method that takes an object that implements the interface as a parameter and "saves"
            the value e.g calls the method defined in the interface.

	     */

        Player abhishek = new Player("Abhishek", 10, 15);
        System.out.println(abhishek.toString());
        saveObject(abhishek);

        abhishek.setHitPoints(8);
        System.out.println(abhishek);
        abhishek.setWeapon("Stormbringer");
        saveObject(abhishek);
//        loadObject(abhishek);
        System.out.println(abhishek);

        ISavable werewolf = new Montser("werewolf", 20, 40);
//        System.out.println((Montser) werewolf).getStrength());
        System.out.println(werewolf);
        saveObject(werewolf);
    }

    public static ArrayList<String> readValues() {
        ArrayList<String> values = new ArrayList<String >();
        Scanner sc = new Scanner(System.in);
        boolean quit = false;
        int index = 0;
        System.out.println("Choose\n" +
                            "1 - To enter a string\n" +
                            "0 - To quit");

        while (!quit) {
            System.out.println("Choose an option: ");
            int choice = sc.nextInt();
            sc.nextLine();
            switch (choice) {
                case 0:
                    quit = true;
                    break;
                case 1:
                    System.out.println("Enter a string: ");
                    String stringInput = sc.nextLine();
                    values.add(index, stringInput);
                    index++;
                    break;
            }
        }
        return values;
    }

    public static void saveObject(ISavable objectToSave) {
        for (int i = 0; i < objectToSave.write().size(); i++) {
            System.out.println("Saving " + objectToSave.write().get(i) + " to storage device");
        }
    }

    public static void loadObject(ISavable objectToLoad) {
        ArrayList<String> values = readValues();
        objectToLoad.read(values);
    }
}
