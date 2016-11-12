package com.santosh;

public class Main {

    public static void main(String[] args) {
	    BankAccount b1 = new BankAccount();
        //BankAccount b2 = new BankAccount("123456", 0.0, "Santosh Marigowda", "santosh@gmail.com", "0987675432");

        b1.deposit(100.987);
        System.out.println("balance = " + b1.getBalance());
        b1.withdraw(100.00);
        System.out.println("balance = " + b1.getBalance());
        b1.withdraw(100.00);

        BankAccount timsAccount = new BankAccount("23456",345.90,"Santosh M", "san@gmail.com", "07898765543");
        System.out.println(timsAccount.getAccountNumber());

        VIPCustomer suki = new VIPCustomer();
        System.out.println(suki.getName());

        VIPCustomer suki2 = new VIPCustomer("Santosh", 900.00, "santosh@gmail.com");
        System.out.println(suki2.getName());

        VIPCustomer suki3 = new VIPCustomer("Roopa", "roopa@gmail.com");
        System.out.println(suki3.getCreditLimit());

    }
}
