package com.bridgelabz;

import java.util.LinkedList;

public class StackLogic {
    LinkedList<Integer> stack = new LinkedList<>();

    public void push(int data) {
        stack.addFirst(data);
    }

    public void myPrint() {
        System.out.println("Stacklist is :");
        for (Integer i : stack) {
            System.out.println(" " + i);
        }
    }
}




