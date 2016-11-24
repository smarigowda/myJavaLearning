package com.santosh;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

public class Main {

    public static void main(String[] args) {
        LinkedList<String> placesToVisit = new LinkedList<>();
//        placesToVisit.add("Sydney");
//        placesToVisit.add("Melbourne");
//        placesToVisit.add("Brisbane");
//        placesToVisit.add("Perth");
//        placesToVisit.add("Canberra");
//        placesToVisit.add("Adelaide");
//        placesToVisit.add("Darwin");
//
//        printList(placesToVisit);
//
//        placesToVisit.add(1, "Alice Springs");
//        printList(placesToVisit);
//
//        placesToVisit.remove(0);
//        printList(placesToVisit);

        addInOrder(placesToVisit, "Kodiyala");
        addInOrder(placesToVisit, "Melbourne");
        addInOrder(placesToVisit, "Adelaide");
        addInOrder(placesToVisit, "Darwin");

        printList(placesToVisit);
    }

    private static void printList(LinkedList<String> llstr) {
        Iterator<String> iterator = llstr.iterator();
        while(iterator.hasNext()) {
            System.out.println("Now visiting..." + iterator.next());
        }
        System.out.println("========================================");
    }

    private static boolean addInOrder(LinkedList<String> llstr, String newCity) {
        ListIterator<String> iter = llstr.listIterator();

        while(iter.hasNext()) {
            int comparison = iter.next().compareTo(newCity);
            if(comparison == 0) {
                System.out.println("City already exists.");
                return false;
            } else if(comparison > 0) {
                iter.previous();
                iter.add(newCity);
                return true;
            } else if(comparison < 0){

            }
        }
        iter.add(newCity);
        return true;
    }
}
