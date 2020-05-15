package org.step.api.stream;

import java.io.IOException;
import java.io.Serializable;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.*;
import java.util.stream.Collectors;
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
//        IntSummaryStatistics intSummaryStatistics = integerList.stream()
//                // Не терминальный, вернул стрим
//                .filter(integer -> integer > 300 && integer < 700)
//                // не терминальный, вернул стрим
//                .limit(200)
//                // не терминальный, вернул стрим
//                .skip(100)
//                // не терминальный, вернул Инт Стрим
//                .mapToInt(Integer::intValue)
//                // Терминальный, вернул объект IntSummaryStatistics
//                .summaryStatistics();
//
//        System.out.println(intSummaryStatistics.getMax());
//        System.out.println(intSummaryStatistics.getMin());
//        System.out.println(intSummaryStatistics.getAverage());
//        System.out.println(intSummaryStatistics.getCount());
//        System.out.println(intSummaryStatistics.getSum());

        terminalMethods();
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
        List<String> stringList = new ArrayList<>();

        stringList.add("First");
        stringList.add("Second");
        stringList.add("Third");
        // Находит первый элемент
        Optional<Integer> first = integerList.stream()
                .filter(integer -> integer > 3)
                .findFirst();
        // Любой подходящий условию элемент
        Integer zero = integerList.stream()
                .filter(integer -> integer == 0)
                .findAny()
                .orElseThrow(() -> new IllegalArgumentException("0 is not found"));
        // Мы делаем все элементы уникальными и собираем в Сет
        Set<Integer> collect = integerList.stream()
                .distinct()
                .collect(Collectors.toSet());
        // Коллекция стрингов в один большой стринг
        String joinedString = stringList.stream()
                .collect(Collectors.joining("/", "localhost:5601", "+"));
        // Коллекцию стрингов и собираем в Мап
        Map<Integer, String> integerStringMap = stringList.stream()
                .collect(Collectors.toMap(
                        String::hashCode,
                        str -> str
                ));
        // Подсчитываем общее число элементов в коллекции
        long count = integerList.stream()
                .count();
        // Удовлетворяет-ли хотя бы один элемент условия
        boolean isAnyMatch = integerList.stream()
                .anyMatch(integer -> integer > 1000);
        // Нет ни одного совпадения в коллекции с условием
        boolean isNoneMatch = integerList.stream()
                .noneMatch(integer -> integer > 1000);
        // Все элементы в коллекции должны соответствовать условию
        boolean isAllMatch = integerList.stream()
                .allMatch(integer -> integer >= 0);
        // Максимальное число
        Optional<Integer> maxInteger = integerList.stream()
                .max(Integer::compareTo);
        // Минимальное число
        Optional<Integer> minInteger = integerList.stream()
                .min(Integer::compareTo);
        // Не возвращает ничего, а просто делает что-то над каждым элементом в коллекции
        integerList.forEach(System.out::println);
        // Не возвращает ничего, а просто делает что-то над каждым элементом в коллекции
        // но с сохранением порядка если работаете в многопоточном приложении
        integerList.parallelStream().forEachOrdered(System.out::println);
        // Трансформирует коллекцию объектов в массив
        Object[] objects = integerList.toArray();

        // Трансформируем обычный стрим в стрим Интов
        IntStream intStream = stringList.stream()
                .mapToInt(String::length);

        // Максимальное значение
        OptionalInt max = intStream.max();
        // Минимальное значение
        OptionalInt min = intStream.min();
        // Среднее
        OptionalDouble average = intStream.average();
        // Сумма
        int sum = intStream.sum();
        // Вся статистика
        IntSummaryStatistics intSummaryStatistics = intStream.summaryStatistics();

        // Вернуть из интового стрима в обычный стрим
        Stream<StringBuffer> stringBufferStream = intStream.mapToObj(StringBuffer::new);

        // Проверяет параллельный ли стрим
        boolean isParallel = integerList.stream()
                .isParallel();
        // Создает сначала параллельный стрим, потом однопоточный стрим
        List<String> integerStringValue = integerList.parallelStream()
                .filter(integer -> integer > 5)
                .sequential()
                .map(String::valueOf)
                .collect(Collectors.toList());
        // Создает сначала однопоточный стрим, потом параллельный стрим
        List<StringBuffer> stringBufferList = integerList.stream()
                .filter(integer -> integer < 6)
                .parallel()
                .map(StringBuffer::new)
                .collect(Collectors.toList());
        // Создаем параллельный стрим, и если порядок не важен, делаем его не упорядоченным
        // и проводим дальнейшие действия
        List<Integer> collect1 = integerList.parallelStream()
                .unordered()
                .distinct()
                .collect(Collectors.toList());
    }
}
