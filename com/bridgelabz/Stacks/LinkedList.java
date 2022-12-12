package com.bridgelabz.Stacks;

/**
 * @author Govardhan Reddy
 */
public class LinkedList {
    /**
     * create a linked list use in staks
     */
    Node top;

    public void push(int data) {
        Node newNode = new Node();
        if (newNode == null) {
            top = newNode;
        }
        newNode.data = data;
        newNode.next = top;
        top = newNode;
    }

    public void print() {
        Node temp = top;
        if (top == null) {
            System.out.println("Stack list is empty");
        } else {
            while (temp != null) {
                System.out.print(temp.data + " ,");
                temp = temp.next;
            }
        }
    }
}
