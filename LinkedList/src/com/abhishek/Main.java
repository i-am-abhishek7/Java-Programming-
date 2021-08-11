package com.abhishek;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
	    Customer customer = new Customer("Abhishek", 54.96);
	    Customer anotherCustomer;
	    anotherCustomer = customer;
	    anotherCustomer.setBalance(12.21);
        System.out.println("Balance for customer " + customer.getName() + " is " + customer.getBalance());

		ArrayList<Integer> inList = new ArrayList<Integer>();

		inList.add(1);
		inList.add(3);
		inList.add(4);

		for (int i = 0; i < inList.size(); i++) {
			System.out.println(i + ": " + inList.get(i));
		}

		System.out.println();

		inList.add(1, 2);

		for (int i = 0; i < inList.size(); i++) {
			System.out.println(i + ": " + inList.get(i));
		}

		System.out.println();

		inList.remove(1);
		for (int i = 0; i < inList.size(); i++) {
			System.out.println(i + ": " + inList.get(i));
		}
    }
}
