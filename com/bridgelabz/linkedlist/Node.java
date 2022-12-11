package com.bridgelabz.linkedlist;

/**
 * @author Govardhan Reddy
 */
public class Node {
    /**
     * In linked list data stored noncontinuous memory
     * each node divided two parts one part contain data and another part contain next node address
     */
    int data;
    Node next;

    /**
     *create a parameterized constructor
     */
    public Node(int data) {
        this.data = data;
        this.next = null;
    }
}
