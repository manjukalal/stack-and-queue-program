package com.bridgelabz;

import java.util.LinkedList;

public class StackLogic {
    LinkedList<Integer> stack = new LinkedList<>();

    public void push(int data) {
        stack.addFirst(data);
    }

    public void peek() {
        System.out.println(" peek element in the stacklist :"  + stack.peek());
    }

    public void pop() {
        if (stack.size() == 0) {
            System.out.println("List is empty");
        } else {
            stack.pop();
        }
    }

    public void myPrint() {
        System.out.println("Stacklist is :");
        for (Integer i : stack) {
            System.out.print(" " + i);

        }

    }
}



