package org.step.buffer.builder;

public class ExampleBufferBuilder {

    static StringBuilder first = new StringBuilder();
    static StringBuilder second = new StringBuilder("First");
    static StringBuilder third = new StringBuilder("First".subSequence(0, 5));
    static StringBuilder fourth = new StringBuilder(20);

    public static void main(String[] args) {
        exampleStringBuilder();
//        ExampleBufferBuilder exampleBufferBuilder = new ExampleBufferBuilder();
//        exampleBufferBuilder.methodsStringBuilderExample();
        methodsStringBuilderExample();
    }

    private static void exampleStringBuilder() {
        int length = first.length();
        char c = first.charAt(3);
        first.setCharAt(3, 'c');
        CharSequence charSequence = first.subSequence(1, 3);
    }

    private static void methodsStringBuilderExample() {
        char[] chars = {'a', 'b', 'c'};

        first.append(1);
        first.append("new");
        first.append(true);
        first.append(chars);

        first.insert(5, 1);
        first.insert(6, chars);

        StringBuilder stringBuilder = first.deleteCharAt(1);
        StringBuilder delete = first.delete(3, 5);
        StringBuilder reverse = first.reverse();

        int capacity = first.capacity();
        int length = first.length();

        first.ensureCapacity(10);

        first.trimToSize();

        first.setLength(20);

        String s = first.toString();
    }
}
