package com.abhishek;

import java.util.Scanner;

public class Main {

    private static Scanner sc = new Scanner(System.in);
    private static MobilePhone mobilePhone = new MobilePhone("7838813131");

    public static void main(String[] args) {

        boolean quit = false;
        startPhone();
        printActions();
        while(!quit) {
            System.out.println("\nEnter actions: (6 to show available actions)");
            int action = sc.nextInt();
            sc.nextLine();

            switch (action) {
                case 0:
                    System.out.println("\nShutting down...");
                    break;
                case 1:
                    mobilePhone.printContacts();
                    break;
                case 2:
                    addNewContact();
                    break;
                case 3:
                    updateContact();
                    break;
                case 4:
                    removeContact();
                    break;
                case 5:
                    queryContact();
                    break;
                case 6:
                    printActions();
                    break;
                case 7:
                    quit = true;
                    break;
            }
        }
    }

    private static void addNewContact() {
        System.out.println("Enter new contact name: ");
        String name = sc.nextLine();
        System.out.println("Enter phone number: ");
        String phone = sc.nextLine();
        Contact newContact = Contact.createContact(name, phone);
        if(mobilePhone.addNewContact(newContact)) {
            System.out.println("New contact added: name = " + name + " phone " + phone);
        } else {
            System.out.println("Cannot add, " + name + " already on file");
        }
    }

    private static void updateContact() {
        System.out.println("Enter existing contact name: ");
        String name = sc.nextLine();
        Contact existingContactRecord = mobilePhone.queryContact(name);
        if(existingContactRecord == null) {
            System.out.println("Contact not found.");
            return;
        }

        System.out.println("Enter new contact name: ");
        String newName = sc.nextLine();
        System.out.println("Enter new contact phone number: ");
        String newNumber = sc.nextLine();
        Contact newContact = Contact.createContact(newName, newNumber);
        if(mobilePhone.updateContact(existingContactRecord, newContact)) {
            System.out.println("Successfully update record.");
        } else  {
            System.out.println("Error updating record.");
        }
    }

    private static void removeContact() {
        System.out.println("Enter the existing contact name: ");
        String name = sc.nextLine();
        Contact existingContactRecord = mobilePhone.queryContact(name);
        if(existingContactRecord == null) {
            System.out.println("Contact not found");
            return;
        }

        if(mobilePhone.removeContact(existingContactRecord)) {
            System.out.println("Successfully deleted");
        } else {
            System.out.println("Error deleting contact");
        }
    }

    private static void queryContact() {
        System.out.println("Enter the existing contact name: ");
        String name = sc.nextLine();
        Contact existingContactRecord = mobilePhone.queryContact(name);
        if(existingContactRecord == null) {
            System.out.println("Contact not found");
            return;
        }

        System.out.println("Name: " + existingContactRecord.getName() + " phone number is: " + existingContactRecord.getPhoneNumber());
    }

    private static void startPhone() {
        System.out.println("Starting phone....");
    }

    private static void printActions() {
        System.out.println("\nAvailable actions:\nPress");
        System.out.println("0 - To shutdown\n" +
                           "1 - To print contacts\n" +
                           "2 - To add a new contact\n" +
                           "3 - To update an existing contact\n" +
                           "4 - To remove an existing contact\n"  +
                           "5 - To query if an existing contact exists" +
                           "6 - To print a list of available actions\n");
        System.out.println("Choose your action: \r");

    }
}
