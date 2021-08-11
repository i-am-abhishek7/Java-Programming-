package com.abhishek;

public class Main {

    public static void main(String[] args) {
	    Person person = new Person();
	    person.setFirstName("");
	    person.setLastName("");
	    person.setAge(10);
        System.out.println("Full Name is: " + person.getFullName());
        System.out.println("Is Teen: " + person.isTeen());
        person.setFirstName("Abhishek");
        person.setAge(18);
        System.out.println("Full Name is: " + person.getFullName());
        System.out.println("Is Teen: " + person.isTeen());
        person.setLastName("Thakur");
        System.out.println("Full Name is: " + person.getFullName());
    }
}
