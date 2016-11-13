package com.santosh;

public class Main {

    public static void main(String[] args) {

        String bankName = "National Australia Bank";
	    Bank bank = new Bank(bankName);

        String branchName1 = "Adelaide";
        if(bank.addBranch(branchName1)) {
            System.out.println("Adelaide branch created.");
        }

        bank.addCustomer(branchName1, "Santosh", 50.5);
        bank.addCustomer(branchName1, "Roopa", 50.5);
        bank.addCustomer(branchName1, "Sukruthi", 50.5);

        bank.addTransaction(branchName1, "Santosh", 44.90);
        bank.listCustomers(branchName1, true);

        String branchName2 = "Axis Bank India";
        bank.addBranch(branchName2);
        bank.addCustomer(branchName2, "Santosh", 50.5);
        bank.addCustomer(branchName2, "Roopa", 50.5);
        bank.addCustomer(branchName2, "Sukruthi", 50.5);

        bank.listCustomers(branchName2, false);

        bank.addBranch("Melbourne");
        if(!bank.addCustomer("Melbourne", "Brian", 5.56)) {
            System.out.println("Error.. branch does not exist");
        }

        if(!bank.addBranch("Melbourne")) {
            System.out.println("branch already exists");
        }

        if(!bank.addTransaction("Melbourne", "Fogus", 56.09)) {
            System.out.println("Customer does not exist at branch Melbourne");
        }

        if(!bank.addCustomer("Axis Bank India", "Santosh", 45.09)) {
            System.out.println("Customer Santosh already exist at branch Axis");
        }
    }
}
