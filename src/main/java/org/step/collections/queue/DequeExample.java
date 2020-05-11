package org.step.collections.queue;

import java.util.ArrayDeque;
import java.util.Deque;

public class DequeExample {

    public static void main(String[] args) {
        /*
        Так же в конструктор можно передать коллекцию
         */
        Deque<String> stringDeque = new ArrayDeque<>(5);

        stringDeque.addFirst("");
        stringDeque.addLast("");
        stringDeque.offerFirst("");
        stringDeque.offerLast("");
        stringDeque.peekFirst();
        stringDeque.peekLast();
        stringDeque.pollFirst();
        stringDeque.pollLast();
        stringDeque.removeFirstOccurrence("");
        stringDeque.removeLastOccurrence("");
        stringDeque.removeFirst();
        stringDeque.removeLast();
    }
}
