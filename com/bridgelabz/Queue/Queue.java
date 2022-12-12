package com.bridgelabz.Queue;

/**
 * @author Govardhan Reddy
 */
public class Queue {
    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        list.enqueue(56);
        list.enqueue(30);
        list.enqueue(70);
        list.dequeue();
    }
}
