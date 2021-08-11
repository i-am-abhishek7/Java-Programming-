package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your name : ");
        String name = sc.nextLine();
        System.out.print("Enter your birth year : ");
        int birthYear = sc.nextInt();
        int age = 2021 - birthYear;

        System.out.println("Your name is " + name  + " ,and you are " + age + " years old.");
        sc.close();

    }
}
