package org.step.collections;

import java.util.*;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;

public class ExampleCollections {

    private static void exampleCollections() {
        List<String> stringCollection = new ArrayList<>();
        List<String> stringList = new LinkedList<>();

        Queue<String> queue = new PriorityQueue<>(new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return o2.length() - o1.length();
            }
        });
        Deque<String> deque = new ArrayDeque<>();

        Set<String> stringSet = new HashSet<>();
        SortedSet<String> strings = new TreeSet<>(new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return o2.length() - o1.length();
            }
        });
        NavigableSet<String> navigableSet = new TreeSet<>();

        Map<Integer, String> map = new HashMap<>();
        SortedMap<Integer, String> stringSortedMap = new TreeMap<>();
        NavigableMap<Integer, String> navigableMap = new TreeMap<>();

        AbstractList<String> abstractList = new ArrayList<>();

        List<String> stringList1 = Collections.synchronizedList(stringCollection);
        Set<String> stringSet1 = Collections.synchronizedSet(stringSet);

        Map<Integer, String> concurrentMap = new ConcurrentHashMap<>();
        List<Object> objects = new CopyOnWriteArrayList<>();
    }
}
