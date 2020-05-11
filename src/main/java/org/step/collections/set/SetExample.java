package org.step.collections.set;

import java.util.AbstractSet;
import java.util.HashSet;
import java.util.Set;

public class SetExample<T> {

    public static void main(String[] args) {
        Set<String> firstSet = new HashSet<>();
        Set<String> secondSet = new HashSet<>(firstSet);
        Set<String> thirdSet = new HashSet<>(16);
        Set<String> fourthSet = new HashSet<>(16, 0.8F);
        AbstractSet<String> abstractSet = new HashSet<>();

        boolean isSetRemoved = firstSet.removeAll(secondSet);
        boolean isSetContains = firstSet.containsAll(secondSet);
        boolean isSetAdd = firstSet.addAll(secondSet);
        boolean isRetained = firstSet.retainAll(secondSet);

        boolean isAdd = firstSet.add("String");
        boolean isRemoved = firstSet.remove("String");
        boolean isContains = firstSet.contains("String");

        int size = firstSet.size();
        boolean isEmpty = firstSet.isEmpty();
        firstSet.clear();
        Object[] objects = firstSet.toArray();

        for (Object object : objects) {
            String each = (String) object;
        }
    }
}
