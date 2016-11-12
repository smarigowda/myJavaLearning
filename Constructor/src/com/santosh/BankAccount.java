package com.santosh;

public class BankAccount {
    private String accountNumber;
    private double balance;
    private String customerName;
    private String emailid;
    private String phoneNumber;

    public BankAccount(String customerName, String emailid, String phoneNumber) {
        this("123456", 0.0, customerName, emailid, phoneNumber);
    }

    public BankAccount() {
        this("123456", 0.0, "Default Name", "santosh@gmail.com", "0987675432");
        System.out.println("empty constructor called...");
    }

    public BankAccount(String accountNumber, double balance, String customerName, String emailid, String phoneNumber) {
        this.accountNumber = accountNumber;
        this.balance = balance;
        this.customerName = customerName;
        this.emailid = emailid;
        this.phoneNumber = phoneNumber;
        System.out.println("constructor with parameter called");
    }
    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public void setEmailid(String emailid) {
        this.emailid = emailid;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getAccountNumber() {
        return this.accountNumber;
    }

    public double getBalance() {
        return this.balance;
    }

    public String getCustomerName() {
        return this.customerName;
    }

    public String getEmailid() {
        return this.emailid;
    }

    public String getPhoneNumber() {
        return this.phoneNumber;
    }

    public void deposit(double amount) {
        this.balance = this.balance + amount;
        System.out.println("A deposit of " + amount + " is made");
    }

    public double withdraw(double amount) {
        if (this.balance - amount < 0) {
            System.out.println("Sorry, you do not have enough money");
            System.out.println("Your current balance is: " + this.balance);
            return -1;
        }
        this.balance = this.balance - amount;
        System.out.println("A withdraw of " + amount + " is made");
        return this.balance;
    }

}
