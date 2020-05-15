package org.step.api.stream;

import java.io.IOException;
import java.io.Serializable;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.*;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamExample {

    private static List<Integer> integerList = new ArrayList<>();
    private static Random random = new Random();

    static {
        for (int i = 0; i < 1000; i++) {
            integerList.add(i);
        }
    }

    public static void main(String[] args) throws IOException {
        IntSummaryStatistics intSummaryStatistics = integerList.stream()
                // Не терминальный, вернул стрим
                .filter(integer -> integer > 300 && integer < 700)
                // не терминальный, вернул стрим
                .limit(200)
                // не терминальный, вернул стрим
                .skip(100)
                // не терминальный, вернул Инт Стрим
                .mapToInt(Integer::intValue)
                // Терминальный, вернул объект IntSummaryStatistics
                .summaryStatistics();

        System.out.println(intSummaryStatistics.getMax());
        System.out.println(intSummaryStatistics.getMin());
        System.out.println(intSummaryStatistics.getAverage());
        System.out.println(intSummaryStatistics.getCount());
        System.out.println(intSummaryStatistics.getSum());
    }

    private static void createStream() throws IOException {


        Stream<Integer> first = integerList.stream();
        Stream<Integer> integerStream = Stream.of(1, 2, 3);
        Stream<Object> string = Stream.of(1, "String", 1.1);
        Stream<Object> stream = Arrays.stream(integerList.toArray());
        Stream<String> lines = Files.lines(Paths.get("text.txt"));
        IntStream chars = "abcd".chars();
        Stream.Builder<Object> add = Stream.builder()
                .add("a")
                .add("b")
                .add("c");
        add.accept("d");
        add.accept("e");
        Stream<Object> build = add.build();
        Stream<Integer> integerStream1 = integerList.parallelStream();
        Stream<Integer> iterate = Stream.iterate(0, n -> n + 1);
        Stream<String> generate = Stream.generate(() -> "Next " + random.nextInt(1000));
    }

    private static void nonTerminalMethods() {
        // Фильтрует значение согласно условию
        Stream<Integer> integerStream = integerList.stream()
                .filter(integer -> integer > 2);
        // Пропустить 2 элемента с начала
        Stream<Integer> skip = integerList.stream().skip(2);
        // Убирает дубликаты
        Stream<Integer> distinct = integerList.stream().distinct();
        // Преобразует в другой объект
        Stream<String> stringStream = integerList.stream().map(String::valueOf);
        // Создан для отладки
        Stream<Integer> peek = integerList.stream().peek(System.out::println);
        // Взять максимально 2 значения
        Stream<Integer> limit = integerList.stream().limit(2);
        // Сортируем стрим
        Stream<Integer> sorted = integerList.stream()
                .sorted(Comparator.comparingInt(Integer::intValue));
        // mapToInt, mapToDouble, mapToLong, mapToObject - трансформирует
        // в стрим элементов согласно методам
        IntStream intStream = integerList.stream().mapToInt(Integer::intValue);
        // На шаг дальше map (возвращает стрим от интов, а мап бы вернул стрим стримов от инта
        Stream<Integer> integerStream1 = integerList.stream().flatMap(Stream::of);
    }

    private static void terminalMethods() {
        Optional<Integer> first = integerList.stream().findFirst();
    }
}
