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
        list.append(70);
        list.lastPop();
        /**
         * Printing the data
         */
        System.out.println("Print linked list in delete last method");
        list.print();
    }
}
