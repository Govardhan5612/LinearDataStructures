package com.bridgelabz.Queue;

/**
 * @author Govardhn reddy
 */
public class LinkedList {
    /**
     * in Queue data stored based on first in first out
     */
    Node first;
    Node last;
    int size;
    public void enqueue(int data){
        /**
         * Data stored function
         */
        Node temp = last;
        last=new Node();
        last.data=data;
        last.next=null;
        if (size==0){
            first=last;
        }
        else {
            temp.next=last;
        }
        size++;
        System.out.print(data+" ,");
    }
}
