package com.bridgelabz.Stacks;

public class Stacks {
    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        list.push(56);
        list.push(30);
        list.push(70);
        list.pop();
        System.out.println("peak element of the list "+list.peak());
        list.print();
    }
}
