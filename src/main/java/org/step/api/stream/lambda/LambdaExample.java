package org.step.api.stream.lambda;

import java.util.Arrays;
import java.util.Comparator;
import java.util.concurrent.Callable;

public class LambdaExample {

    public static void main(String[] args) {
        String[] arrayString = {"a", "bsda", "dsadsdad", "ds", "dsa", "a", "dsadqwewqfsafa"};

//        Arrays.sort(arrayString, new ComparatorExample());
        Comparator<String> stringComparator = (final String first, @MyAnnotation String second) -> {
            return first.length() - second.length();
        };

        Comparator<String> secondEdition = (first, second) -> first.length() - second.length();

        Comparator<String> thirdEdition = Comparator.comparingInt(String::length);

        Arrays.sort(arrayString, Comparator.comparingInt(String::length));

        Arrays.stream(arrayString).forEach(System.out::println);

        Runnable runnable = () -> {
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        };

        Callable<String> callable = () -> {
            Thread.sleep(100);
            return "I'am callable string";
        };
    }
}
