package org.step.api.stream.optional;

import java.util.*;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Stream;

public class OptionalExample {

    public static void main(String[] args) {
        Map<Integer, String> integerStringMap = new HashMap<>();
        List<List<String>> stringListList = new ArrayList<>();
        
        stringListList.add(new ArrayList<>(Collections.singletonList("First")));
        stringListList.add(new ArrayList<>(Collections.singletonList("Second")));
        stringListList.add(new ArrayList<>(Collections.singletonList("Third")));

        integerStringMap.put(1, "First super");
        integerStringMap.put(2, "Second");

        Optional<Integer> optionalInteger = Optional.of(1);
        Optional<String> stringOptional = Optional.of("First");

        Optional<String> nullableIntegerOptional = Optional.ofNullable(integerStringMap.get(1));

        Optional<Object> empty = Optional.empty();

//        boolean isPresent = nullableIntegerOptional.isPresent();

//        if (isPresent) {
//            String s = nullableIntegerOptional.get();
//        } else {
//            String emptyString = nullableIntegerOptional.orElse("Empty string");
//        }
        String orElse = nullableIntegerOptional.orElse("Empty string");
        String orElseGet = nullableIntegerOptional.orElseGet(() -> "Empty string");
        String orElseThrow = nullableIntegerOptional
                .orElseThrow(() -> new IllegalArgumentException("Empty string"));

        String lessThanFive = nullableIntegerOptional
                .filter(str -> str.length() > 5)
                .orElse("String is less than five");

        Function<String, Integer> function = new Function<String, Integer>() {
            @Override
            public Integer apply(String s) {
                return s.length();
            }
        };

        Function<String, Integer> functionWithLambda = str -> str.length();

        Integer integer = nullableIntegerOptional
                .filter(str -> str.length() > 5)
                // .map(str -> str.length())
                .map(function)
                .orElse(0);

        Optional<List<List<String>>> optionalListList = Optional.of(stringListList);

        Optional<Optional<List<String>>> strings1 = optionalListList
                .map(lists -> lists.stream().findFirst());

        Optional<List<String>> strings = optionalListList
                .flatMap(lists -> lists.stream().findFirst());

//        System.out.println(lessThanFive);
        System.out.println(integer);

        Predicate<String> predicate = new Predicate<String>() {
            @Override
            public boolean test(String s) {
                return s.length() > 5;
            }
        };

        /*
        Дефолтные методы с созданным анонимным классом интерфейса

        predicate.and();
        predicate.negate();
        predicate.or();
         */

        /*
        Статические методы без создания анонимного класса интерфейса

        Predicate.isEqual();
        Predicate.not();
         */
    }
}
