package com.company;

import java.util.Scanner;

public class Main {

    private static Scanner scanner = new Scanner(System.in);
    private static MobilePhone mobilePhone = new MobilePhone("07920830031");

    public static void main(String[] args) {

        boolean quit = false;
        startPhone();
        printActions();

        while(!quit) {

            System.out.println("enter action: (6 to show list of available actions)");

            int action;

            try {

                action = scanner.nextInt();

                scanner.nextLine();

                switch(action) {
                    case 0:
                        System.out.println("Shutting down phone...");
                        quit = true;
                        break;
                    case 1:
                        printContacts();
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
                }

            } catch (Exception e) {
                System.out.println("that is not a valid action...try again.");
                scanner.nextLine();
            }
        }

    }

    private static void queryContact() {

        System.out.println("Enter contact name to query: ");
        String name = scanner.nextLine();
        Contact contact = mobilePhone.queryContact(name);

        if(contact == null) {
            System.out.println("Contact not found");
            return;
        }
        System.out.println("Contact found:");
        System.out.println("Name: " + contact.getName() + "Number: " + contact.getPhoneNumber());
    }

    private static void updateContact() {

        System.out.println("Enter existing contact name which you need to update:");
        String name = scanner.nextLine();
        Contact contact = mobilePhone.queryContact(name);

        if(contact == null) {
            System.out.println("Contact not found");
            return;
        }

        System.out.println("Enter new contact name:");
        String newName = scanner.nextLine();
        System.out.println("Enter new contact number:");
        String newNumber = scanner.nextLine();

        Contact newContact = Contact.createContact(newName, newNumber);
        if(mobilePhone.updateContact(contact, newContact)) {
            System.out.println("Successfully updated the contact");
        } else {
            System.out.println("Error updating record....!");
        }

    }

    private static void removeContact() {

        System.out.println("Enter existing contact name which you need to remove:");
        String name = scanner.nextLine();
        Contact contact = mobilePhone.queryContact(name);

        if(contact == null) {
            System.out.println("Contact not found");
            return;
        }

        if(mobilePhone.removeContact(contact)) {
            System.out.println("Successfully deleted");
        } else {
            System.out.println("Error deleting contact");
        }
    }

    private static void addNewContact() {
        System.out.println("Enter the contact name:");
        String name = scanner.nextLine();
        System.out.println("Enter the phone number:");
        String number = scanner.nextLine();
        Contact contact = Contact.createContact(name, number);
        if (mobilePhone.addNewContact(contact)) {
            System.out.println("New contact is added successfully");
        } else {
            System.out.println("Can not add this contact, it is already in file");
        }
    }

    public static void startPhone() {
        System.out.println("Starting the phone...");
    }

    public static void printContacts() {
        mobilePhone.printContacts();
    }

    public static void printActions() {
        System.out.println("Available actions:");
        System.out.println("0. to shutdown");
        System.out.println("1. to print contacts");
        System.out.println("2. to add a new contact");
        System.out.println("3. to update an existing contact");
        System.out.println("4. to remove an existing contact");
        System.out.println("5. to query if a contact exists");
        System.out.println("6. to print a list of available actions");
        System.out.println("Choose your action\n");

    }
}
