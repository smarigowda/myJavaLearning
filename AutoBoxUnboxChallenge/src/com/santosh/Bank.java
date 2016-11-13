package com.santosh;

import java.util.ArrayList;

public class Bank {
    private String name;
    private ArrayList<Branch> branches;

    public Bank(String name) {
        this.name = name;
        this.branches = new ArrayList<>();
    }

    public boolean addBranch(String name) {
        if(findBranch(name) == null) {
            this.branches.add(new Branch(name));
            return true;
        }
        return false;
    }

    public boolean addCustomer(String branchName, String custName, double amount) {
        Branch branch = findBranch(branchName);
        if(branch != null) {
            return branch.newCustomer(custName, amount);
        }
        return false;
    }

    private Branch findBranch(String name) {
        for(int i=0; i<this.branches.size(); i++) {
            Branch branch = this.branches.get(i);
            if(branch.getName().equals(name)) {
                return branch;
            }
        }
        return null;
    }

    public boolean addTransaction(String bName, String cName, double amount) {
        Branch branch = findBranch(bName);
        if(branch != null ) {
            return branch.addCustomerTransaction(cName, amount);
        }
        return false;
    }

    public boolean listCustomers(String bName, boolean showTrans) {
        Branch branch = findBranch(bName);

        if(branch != null) {
            System.out.println("Customer details for branch: " + branch.getName());

            ArrayList<Customer> branchCustomers = branch.getCustomers();

            for(int i=0; i<branchCustomers.size(); i++) {
                Customer customer = branchCustomers.get(i);
                System.out.println("Customer " + i + " " + customer.getName());

                if(showTrans) {
                    ArrayList<Double> transactions = customer.getTransactions();
                    System.out.println("Transactions:");
                    for(int j=0; j<transactions.size(); j++) {
                        System.out.println("Transaction " + j + ":" + transactions.get(j));
                    }
                }

            }

            return true;

        } else {
            return false;
        }


    }




}
