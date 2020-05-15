package org.step.api.stream.lambda;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Visibility {

    public static void main(String[] args) {
        getMessage(true, 5);
        getMessage(false, 10);

        String first = "first";

        Comparator<String> comparator = (str, second) -> {
            return str.length() - second.length();
        };
    }

    private static void getMessage(boolean flag, final int count) {
        final int good = 1;
        List<Integer> integerList = new ArrayList<>();
        Runnable runnable = () -> {
            if (flag) {
                for (int i = 0; i < count; i = i + good) {
                    integerList.add(i);
                    System.out.println("Flag is true " + count);
                    Thread.yield();
                }
                integerList.forEach(System.out::println);
                /*
                for (Integer i : integerList) {
                    System.out.println(i);
                }
                 */
            } else {
                System.out.println("Flag is false " + count);
            }
        };
        new Thread(runnable).start();
    }
}
