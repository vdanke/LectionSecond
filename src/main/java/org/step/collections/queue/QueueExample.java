package org.step.collections.queue;

import java.util.AbstractQueue;
import java.util.PriorityQueue;
import java.util.Queue;

public class QueueExample {

    public static void main(String[] args) {
        Queue<String> stringQueue = new PriorityQueue<>();
        AbstractQueue<String> abstractQueue = new PriorityQueue<>();

        String element = stringQueue.element();

        boolean isOffered = stringQueue.offer("abc");

        String peek = stringQueue.peek();
        /*
        poll - удалит элемент
         */
        String poll = stringQueue.poll();

        String remove = stringQueue.remove();
    }
}
