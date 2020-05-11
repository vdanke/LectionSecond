package org.step.collections.map;

import java.util.*;

public class MapExample {

    public static void main(String[] args) {
        Map<Integer, String> integerStringMap = new HashMap<>();

        integerStringMap.clear();

        String first = integerStringMap.put(1, "First");
        String s = integerStringMap.get(1);
        String remove = integerStringMap.remove(1);

        boolean isKeyContains = integerStringMap.containsKey(1);
        boolean isValueContains = integerStringMap.containsValue("First");

        int size = integerStringMap.size();
        boolean isEmpty = integerStringMap.isEmpty();

        integerStringMap.putAll(Collections.singletonMap(2, "Second"));

        Set<Integer> integers = integerStringMap.keySet();
        Collection<String> values = integerStringMap.values();

        Set<Map.Entry<Integer, String>> entries = integerStringMap.entrySet();
        Iterator<Map.Entry<Integer, String>> iterator = entries.iterator();

        while (iterator.hasNext()) {
            Map.Entry<Integer, String> next = iterator.next();
            Integer key = next.getKey();
            if (key == 2) {
                System.out.println(next.getValue());
            }
        }
    }
}
