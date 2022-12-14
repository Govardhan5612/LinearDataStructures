package com.bridgelabz.linkedlist;

/**
 * @author Govardhan Reddy
 */
public class LinkedListMain {
    /**
     * create a linked list
     */
    public static void main(String[] args) {
        /**
         * create linked list functions
         */
        LinkedList list = new LinkedList();

        /**
         * insert data in between
         */
        list.append(56);
        list.append(30);
        list.append(40);
        list.append(70);
        list.popInBetween(40);
        /**
         * Printing the data
         */
        System.out.println("Print insert in between linked list");
        list.print();
        int [] array={56,30,40,70};
        list.sort(array);
    }
}
