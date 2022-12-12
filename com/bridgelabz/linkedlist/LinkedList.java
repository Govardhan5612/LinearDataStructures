package com.bridgelabz.linkedlist;

import java.util.Arrays;

/**
 * @author Govardhan Reddy
 */
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

    public void append(int data) {
        /**
         * create link list append method
         */
        Node newNode = new Node(data);
        Node temp = head;
        if (head == null) {
            head = newNode;
        } else {
            while (temp.next != null) {
                temp = temp.next;
            }
            temp.next = newNode;
        }
    }

    public void insert(int data) {
        /**
         * Insert node in between nodes
         */
        Node newNode = new Node(data);
        Node left = head;
        Node right = left.next;
        newNode.next = right;
        left.next = newNode;
    }

    public void firstPop() {
        /**
         * Delete first node of the list
         */
        int data = head.data;
        head = head.next;
    }

    public void lastPop() {
        /**
         * Delete last node if the list
         */
        Node temp = head;
        while (temp.next.next != null) {
            temp = temp.next;
        }
        temp.next = null;
    }

    public Node search(int searchData) {
        /**
         * Searching the node in the list
         */
        Node temp = head;
        while (temp != null) {
            if (temp.data == searchData) {
                System.out.println(searchData + " is found in list");
                break;
            }
            temp = temp.next;
        }
        if (temp == null) {
            System.out.println(searchData + " is not found");
        }
        return null;
    }

    public void insertNodeBetween(int data) {
        Node newNode = new Node(data);
        Node left = head.next;
        Node right = left.next;
        newNode.next = right;
        left.next = newNode;
    }

    public void popInBetween(int data) {
        /**
         * Delete node in between list
         */
        int index = 0;
        Node left = head;
        Node right = left.next;
        while (right.data != data) {
            left = left.next;
            right = right.next;
            index++;
        }
        left.next = right.next;
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
            System.out.println();
        }
    }

    public void sort(int [] sort) {
        /**
         * sorting the list use sort method
         */
        Arrays.sort(sort);
        for (int i = 0; i < sort.length; i++) {
            System.out.print(sort[i] + " ,");
        }
    }
}
