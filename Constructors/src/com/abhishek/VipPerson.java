package com.abhishek;

public class VipPerson {
    private String name;
    private double creditLimit;
    private String emailAddress;

    public VipPerson() {
        this("Default Name", 1000.00, "default@gmail.com");
    }

    public VipPerson(String name, double creditLimit) {
        this(name, creditLimit, "unknown@gmail.com");
        this.name = name;
        this.creditLimit = creditLimit;
    }

    public VipPerson(String name, double creditLimit, String emailAddress) {
        this.name = name;
        this.creditLimit = creditLimit;
        this.emailAddress = emailAddress;
    }

    public String getName() {
        return name;
    }

    public double getCreditLimit() {
        return creditLimit;
    }

    public String getEmailAddress() {
        return emailAddress;
    }
}
