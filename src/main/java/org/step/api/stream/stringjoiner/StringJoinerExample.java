package org.step.api.stream.stringjoiner;

import java.util.StringJoiner;

public class StringJoinerExample {

    public static void main(String[] args) {
        StringJoiner first = new StringJoiner(",", "{", "}");
        StringJoiner second = new StringJoiner("-", "~", "{");

        first.setEmptyValue("Empty value");

        first.add("Tralala");
        first.add("Blablabla");

        second.add("First");
        second.add("Second");

        int length = second.length();

        StringJoiner merge = second.merge(first);

        String s = merge.toString();

        System.out.println(s);
    }
}
