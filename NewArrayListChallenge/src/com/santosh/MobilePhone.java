package com.santosh;

import java.util.ArrayList;

public class MobilePhone {

    private ArrayList<Contact> myContacts;
    private String myNumber;

    public MobilePhone(String number) {
        this.myNumber = number;
        this.myContacts = new ArrayList<>();
    }

    public boolean addNewContact(Contact contact) {

        if( findContact(contact.getName()) >= 0 ) {
            System.out.println("Contact already exists");
            return false;
        }

        myContacts.add(contact);
        return true;
    }

    public void printContacts() {
        if(this.myContacts.size() == 0) {
            System.out.println("Contact list is empty. Add some contacts.");
            return;
        }
        System.out.println("Contact List:");
        for(int i=0; i < this.myContacts.size(); i++) {
            System.out.println(i+1 +". " + this.myContacts.get(i).getName() + " " + this.myContacts.get(i).getPhoneNumber());
        }
    }

    private int findContact(Contact contact) {
        return this.myContacts.indexOf(contact);
    }

    private int findContact(String name) {

        for(int i = 0 ; i < this.myContacts.size(); i++) {
            Contact contact = this.myContacts.get(i);
            if(contact.getName().equals(name)) {
                return i;
            }
        }
        return -1;
    }

    public boolean updateContact(Contact oldContact, Contact newContact) {
        int position = findContact(oldContact);
        if(position < 0 ) {
            System.out.println(oldContact.getName() + " was not found");
            return false;
        }

        this.myContacts.set(position, newContact);
        return true;
    }

    public boolean removeContact(Contact contact) {
        int position = findContact(contact);
        if(position < 0 ) {
            System.out.println(contact.getName() + " was not found");
            return false;
        }

        this.myContacts.remove(position);
        System.out.println(contact.getName() + " is deleted");
        return true;
    }

    public String queryContact(Contact contact) {
        if(findContact(contact) >= 0) {
            return contact.getName();
        }
        return null;
    }

    public Contact queryContact(String name) {
        int position = findContact(name);
        if( position >= 0 ) {
            return this.myContacts.get(position);
        }
        return null;
    }
}
