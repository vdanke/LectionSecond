package org.step.collections.set;

import java.util.Comparator;
import java.util.NavigableSet;
import java.util.SortedSet;
import java.util.TreeSet;

public class TreeSetExample {

    private static Comparator<String> comparator;
    private static SortedSet<String> sortedSet;
    private static NavigableSet<String> navigableSet;

    static {
        comparator = new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return o2.length() - o1.length();
            }
        };
        sortedSet = new TreeSet<>(comparator);
        navigableSet = new TreeSet<>(comparator);

        sortedSet.add("f");
        sortedSet.add("fff");
        sortedSet.add("fffffffff");
        sortedSet.add("ff");
        sortedSet.add("ffff");

        navigableSet.add("f");
        navigableSet.add("fff");
        navigableSet.add("fffffffff");
        navigableSet.add("ff");
        navigableSet.add("ffff");
    }

    public static void main(String[] args) {
        TreeSetExample.navigableSet();
    }

    public static void sortedSet() {
        SortedSet<String> strings = sortedSet.headSet("fff");
        SortedSet<String> strings1 = sortedSet.subSet("ffff", "f");
        SortedSet<String> strings2 = sortedSet.tailSet("fff");

        for (String str : strings2) {
            System.out.println(str);
        }

//        for (String str : sortedSet) {
//            System.out.println(str);
//        }
//
//        String first = sortedSet.first();
//
//        System.out.println(first);
    }

    public static void navigableSet() {
        String lower = navigableSet.lower("fff");
        String floor = navigableSet.floor("fffff");
        String higher = navigableSet.higher("fff");
        String ceiling = navigableSet.ceiling("fffff");

        /*
        Удаляют элементы из коллекции
         */
        String first = navigableSet.pollFirst();
        String last = navigableSet.pollLast();

        NavigableSet<String> navigableSet = TreeSetExample.navigableSet.descendingSet();

        for (String str : navigableSet) {
            System.out.println(str);
        }

//        System.out.println(higher);
    }
}
