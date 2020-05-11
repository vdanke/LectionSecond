package org.step.collections.set;

import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

public class LinkedHashSetExample {

    public static void main(String[] args) {
        Set<String> stringSet = new LinkedHashSet<>();

        stringSet.add("First");
        stringSet.add("Second");
        stringSet.add("Third");
        stringSet.add("Fourth");

//        for (String str : stringSet) {
//            System.out.println(str);
//        }

        Iterator<String> iterator = stringSet.iterator();

        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

        Set<String> first = Collections.singleton("First");
    }
}
