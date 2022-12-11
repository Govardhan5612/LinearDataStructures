package com.bridgelabz.linkedlist;

public class LinkedList {
    /**
     * Create a linked list functions
     */
    Node head;

    public void add(int data) {
        /**
         * add the data reverse order in linked list
         */
        Node newNode = new Node(data);
        newNode.next = head;
        head = newNode;
    }

    public void print() {
        /**
         * print the linked list
         */
        if (head == null) {
            System.out.println("Linked list is empty");
        } else {
            Node temp = head;
            while (temp != null) {
                System.out.print(temp.data + " ,");
                temp = temp.next;
            }
        }
    }
}
