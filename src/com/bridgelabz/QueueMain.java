package com.bridgelabz;


import java.util.LinkedList;

class QueueLogic {
    LinkedList<Integer> queue = new LinkedList<>();

    public void enQueue(int data) {
        queue.add(data);
    }

    public void deQueue() {
        if (queue.size() == 0) {
            System.out.println("Queue list is empty");
        } else {
            queue.pop();
        }
    }

    public void toPrint() {
        System.out.println("Queue list is :");
        for (Integer i : queue) {
            System.out.println(" " + i);
        }
    }
}

public class QueueMain {
    public static void main(String[] args) {

        QueueLogic queuelogic = new QueueLogic();
        queuelogic.enQueue(56);
        queuelogic.enQueue(30);
        queuelogic.enQueue(70);
        queuelogic.toPrint();
        queuelogic.deQueue();
        queuelogic.toPrint();
        queuelogic.deQueue();
        queuelogic.toPrint();
        queuelogic.deQueue();
        queuelogic.toPrint();
        queuelogic.deQueue();
    }
}








