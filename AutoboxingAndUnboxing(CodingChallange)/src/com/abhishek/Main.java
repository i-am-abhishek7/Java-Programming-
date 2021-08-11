package com.abhishek;

public class Main {

    public static void main(String[] args) {
	    Bank bank = new Bank("Punjab National Bank");

	    if(bank.addBranch("Civil Lines")) {
			System.out.println("Civil Lines branch created");
		}

	    bank.addCustomer("Civil Lines", "Abhishek", 50.05);
	    bank.addCustomer("Civil Lines", "Ayush", 174.34);
	    bank.addCustomer("Civil Lines", "Kishor", 220.24);

	    bank.addBranch("Sonia Vihar");
	    bank.addCustomer("Sonia Vihar", "Priyanshu",150.32);

	    bank.addCustomerTransaction("Civil Lines", "Abhishek", 44.32);
        bank.addCustomerTransaction("Civil Lines", "Abhishek", 12.22);
        bank.addCustomerTransaction("Civil Lines", "Ayush", 4.22);

        bank.listCustomer("Civil Lines", true);
        bank.listCustomer("Sonia Vihar", true);

        bank.addBranch("Yamuna Vihar");
        if(!bank.addCustomer("Yamuna Vihar", "Bipu", 5.43)) {
			System.out.println("Error Yamuna Viahr branch does not exists");
		}

        if(!bank.addBranch("Civil Lines")) {
			System.out.println("Civil Lines branch already exists");
		}

        if(!bank.addCustomerTransaction("Civil Lines", "Hariom", 23.32)) {
			System.out.println("Customer does not exists at branch");
		}

        if(!bank.addCustomer("Civil Lines", "Ayush", 12.21)) {
			System.out.println("Customer Ayush already exists");
		}
    }
}
