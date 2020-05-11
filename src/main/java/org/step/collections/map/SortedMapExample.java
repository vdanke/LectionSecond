package org.step.collections.map;

import java.util.SortedMap;
import java.util.TreeMap;

public class SortedMapExample {

    public static void main(String[] args) {
        SortedMap<Integer, String> integerStringSortedMap = new TreeMap<>();

        Integer firstKey = integerStringSortedMap.firstKey();

        /*
        Все что меньше 3 получим
         */
        SortedMap<Integer, String> headMap = integerStringSortedMap.headMap(3);

        Integer lastKey = integerStringSortedMap.lastKey();

        SortedMap<Integer, String> subMap = integerStringSortedMap.subMap(1, 3);

        SortedMap<Integer, String> tailMap = integerStringSortedMap.tailMap(2);
    }
}
