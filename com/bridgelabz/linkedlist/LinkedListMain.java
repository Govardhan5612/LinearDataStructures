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
         * add data at first
         */
        list.append(56);
        list.append(30);
        list.append(70);
        /**
         * Printing the data
         */
        System.out.println("Print link list in append method");
        list.print();
    }
}
