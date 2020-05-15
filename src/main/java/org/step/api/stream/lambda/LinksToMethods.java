package org.step.api.stream.lambda;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Supplier;

public class LinksToMethods {

    public static void main(String[] args) {
        LinksToMethods linksToMethods = new LinksToMethods();

        Consumer<String> stringConsumer = str -> {
            System.out.println(str);
        };

        Consumer<String> secondEdition = System.out::println;

        Function<Integer, String> integerStringFunction = Integer::toHexString;
        Comparator<Integer> integerComparator = Integer::compareTo;
        Function<Integer, String> stringFunction = linksToMethods::getString;
        Supplier<List<Integer>> listSupplier = ArrayList::new;

        List<Integer> integers = listSupplier.get();

        Integer[] arraysInteger = {1, 3, 5, 7, 1, 23, 123421, 124};

        Arrays.sort(arraysInteger, Integer::compareTo);

        Arrays.stream(arraysInteger).forEach(System.out::println);


    }

    String getString(Integer integer) {
        return integer.toString();
    }
}
