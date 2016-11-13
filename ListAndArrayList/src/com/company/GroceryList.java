package com.company;

import java.util.ArrayList;

public class GroceryList {

    private ArrayList<String> groceryList = new ArrayList<String>();

    public void addGroceryItem(String item) {
        groceryList.add(item);
    }

    public void printGroceryList() {
        System.out.println("You have " + groceryList.size() + " items");
        for(int i=0; i<groceryList.size(); i++) {
            System.out.println(groceryList.get(i));
        }
    }

    public void modifyGroceryItem(int position, String newItem) {
        groceryList.set(position, newItem);
        System.out.println("Item " + (position + 1) + " has been modified");
    }

    public void removeGroceryItem(int position) {
        String item = groceryList.get(position);
        groceryList.remove(position);
    }

    public String findItem(String searchItem) {
//        boolean exists = groceryList.contains(searchItem);
        int position = groceryList.indexOf(searchItem);
        if(position >= 0) {
            return "item exists at position " + position;
        } else {
            return null;
        }
    }
}
