package com.abhishek;

public class Main {

    public static void main(String[] args) {
//        Account aviAccount = new Account();  //"12345", 0.00, "Abhishek Thakur", "thakurabhishek1313@gmail.com",
//               // "(+91) 7838813131");
//
//        System.out.println(aviAccount.getNumber());
//        System.out.println(aviAccount.getBalance());
//
//        aviAccount.withdrawal(100.0);
//
//        aviAccount.deposit(50.0);
//        aviAccount.withdrawal(100.0);
//
//        aviAccount.deposit(51.0);
//        aviAccount.withdrawal(100.0);
//
//        Account ashuAccount = new Account("Ayush Thakur", "thakurayush5161@gmail.com", "(+91) 7838913131");
//        System.out.println(ashuAccount.getNumber() + " name " + ashuAccount.getCustomerName());
//        System.out.println( + ashuAccount.getBalance());

        VipPerson person1 = new VipPerson();
        System.out.println(person1.getName());
        System.out.println(person1.getEmailAddress());
        System.out.println(person1.getCreditLimit());

        VipPerson person2 = new VipPerson("Abhishek", 250000.00);
        System.out.println(person2.getName());
        System.out.println(person2.getEmailAddress());

        VipPerson person3 = new VipPerson("Ayush", 30000.00, "thakurayush5161@gmail.com");
        System.out.println(person3.getName());
        System.out.println(person3.getEmailAddress());
    }
}
