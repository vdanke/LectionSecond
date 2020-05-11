package org.step.collections.map;

import java.util.*;

public class NavigableMapExample {

    public static void main(String[] args) {
        NavigableMap<Integer, String> navigableMap = new TreeMap<>();

        Map.Entry<Integer, String> lowerEntry = navigableMap.lowerEntry(3);
        Map.Entry<Integer, String> floorEntry = navigableMap.floorEntry(3);
        Map.Entry<Integer, String> higherEntry = navigableMap.higherEntry(3);
        Map.Entry<Integer, String> ceilingEntry = navigableMap.ceilingEntry(3);

        Integer lowerKey = navigableMap.lowerKey(3);
        Integer floorKey = navigableMap.floorKey(3);
        Integer higherKey = navigableMap.higherKey(3);
        Integer ceilingKey = navigableMap.ceilingKey(3);

        Map.Entry<Integer, String> pollFirstEntry = navigableMap.pollFirstEntry();
        Map.Entry<Integer, String> pollLastEntry = navigableMap.pollLastEntry();

        Map.Entry<Integer, String> firstEntry = navigableMap.firstEntry();
        Map.Entry<Integer, String> lastEntry = navigableMap.lastEntry();

        NavigableMap<Integer, String> descendingMap = navigableMap.descendingMap();

        // В обратном порядке
        NavigableSet<Integer> descendingKeySet = navigableMap.descendingKeySet();

        // В том же самом порядке
        NavigableSet<Integer> navigableKeySet = navigableMap.navigableKeySet();

        NavigableMap<Integer, String> navigableSubMapWithBoolean = navigableMap
                .subMap(1, true, 3, true);

        SortedMap<Integer, String> subMap = navigableMap.subMap(1, 3);

        SortedMap<Integer, String> headMap = navigableMap.headMap(1);
        SortedMap<Integer, String> tailMap = navigableMap.tailMap(3);

        NavigableMap<Integer, String> headBoolean = navigableMap.headMap(1, true);
        NavigableMap<Integer, String> tailBoolean = navigableMap.tailMap(3, true);
    }
}
