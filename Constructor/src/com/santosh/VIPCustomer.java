package com.santosh;

public class VIPCustomer {
    private String name;
    private double creditLimit;
    private String emailid;

    public VIPCustomer() {
        this("default name", 400.00, "dummy@gmail.com");
    }

    public VIPCustomer(String name, double creditLimit, String emailid) {
        this.name = name;
        this.creditLimit = creditLimit;
        this.emailid = emailid;
    }

    public VIPCustomer(String name, String emailid) {
       this(name, 600.00, "default@gmail.com");
    }

    public String getName() {
        return name;
    }

    public double getCreditLimit() {
        return creditLimit;
    }

    public String getEmailid() {
        return emailid;
    }
}
