package com.company;

import java.util.Scanner;

public class Main {

    private static Scanner scanner = new Scanner(System.in);
    private static GroceryList glist = new GroceryList();

    public static void main(String[] args) {
        boolean quit = false;
        int choice = 0;
        printInstructions();

        while(!quit) {
            System.out.println("Enter your choice: ");
            choice = scanner.nextInt();
            scanner.nextLine();
            switch(choice) {
                case 0:
                    printInstructions();
                    break;
                case 1:
                    glist.printGroceryList();
                    break;
                case 2:
                    addItem();
                    break;
                case 3:
                    modifyItem();
                    break;
                case 4:
                    removeItem();
                    break;
                case 5:
                    searchItem();
                    break;
                case 6:
                    quit = true;
                    System.out.println("exiting...");
                    break;
            }
        }

    }

    public static void printInstructions() {
        System.out.println("Press ");
        System.out.println("\t 0 - print options");
        System.out.println("\t 1 - print list");
        System.out.println("\t 2 - add an item");
        System.out.println("\t 3 - modify an item");
        System.out.println("\t 4 - remove an item");
        System.out.println("\t 5 - search an item");
        System.out.println("\t 6 - quit");
    }

    public static void addItem() {
        System.out.print("enter a grocery item: ");
        glist.addGroceryItem(scanner.nextLine());
    }

    public static void modifyItem() {
        System.out.print("enter current item name: ");
        String itemName = scanner.nextLine();
        System.out.println("enter replacement item name: ");
        String newItemName = scanner.nextLine();
        glist.modifyGroceryItem(itemName, newItemName);
    }

    public static void removeItem() {
        System.out.print("enter item name to remove: ");
        String itemName = scanner.nextLine();
        glist.removeGroceryItem(itemName);
    }

    public static void searchItem() {
        System.out.println("Enter the item name to search for: ");
        String searchItem = scanner.nextLine();
        if(glist.onFile(searchItem)) {
            System.out.println("item found in the list");
        } else {
            System.out.println("item does not exist in our list");
        }
    }
}
