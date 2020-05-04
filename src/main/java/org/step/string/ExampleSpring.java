package org.step.string;

import java.nio.charset.Charset;
import java.util.Locale;

public class ExampleSpring {

    private static final String example = "Hello World";

    public static void main(String[] args) {
        System.out.println(example);
    }

    private static void exampleConstructor() {
        StringBuilder builder = new StringBuilder("I'am string builder");
        StringBuffer buffer = new StringBuffer("I'am string buffer");

        char[] chars = {'a', 'b', 'c', 'd'};

        String str = new String(chars);
        String builderStr = new String(builder);
        String bufferStr = new String(buffer);
    }

    private static void methodExample(String str, int index) {
        if ((str.length() - 1) > index) {
            char c = str.charAt(3);
            System.out.println("The character in index " + index + " is " + c);
        } else {
            System.out.printf("Your index is more than %d", index);
        }

        CharSequence charSequence = str.subSequence(2, str.length());

        String s = charSequence.toString();

        char[] chars = str.toCharArray();

        boolean isEmpty = str.isEmpty();

        byte[] bytes = str.getBytes();

        byte[] bytes1 = str.getBytes(Charset.forName("cp1251"));

        boolean isFirstEquals = str.equals("first");
        boolean isFirstEqualsIgnoreCase = str.equalsIgnoreCase("first");

        boolean isContentEquals = str.contentEquals(charSequence);
        boolean isContentEqualsStringBuffer = str.contentEquals(new StringBuffer("abc"));

        String intern = str.intern();
    }

    private static void characterExample(String str) {
        String s = str.toUpperCase();
        String s2 = str.toUpperCase(Locale.ENGLISH);
        String s3 = str.toLowerCase(Locale.GERMAN);
        String s1 = str.toLowerCase();

        String s4 = str + "c";
        String new_string = str.concat("new string");

        switch (str.toUpperCase()) {
            case "RU":
                break;
            case "KZ":
                break;
            case "QQ":
                break;
            default:
                throw new IllegalArgumentException("Locale is wrong");
        }
    }

    private static void findSymbolsAndSubstrings(String str) {
        String substring = str.substring(7, str.length());
        String substring1 = str.substring(7);
        String trim = str.trim();

        int i = 3;
        String example = "" + i;

        char[] chars = {'a', 'b', 'c', 'd'};

        CharSequence first = str.subSequence(0, 5);
        CharSequence second = str.subSequence(10, 15);

        int c = str.indexOf('c');
        int c1 = str.indexOf('c', 5);
        int str1 = str.indexOf("str");
        int str2 = str.indexOf("str", 5);

        int c2 = str.lastIndexOf('c');
        int str4 = str.lastIndexOf("str", 5);
        int c3 = str.lastIndexOf('c', 5);
        int str3 = str.lastIndexOf("str");

        String replace = str.replace('c', 'v');
        String replace1 = str.replace(first, second);

        boolean isContains = str.contains("abc");

        String s = String.copyValueOf(chars);
        String s1 = String.copyValueOf(chars, 3, chars.length);

        boolean isEndsWith = str.endsWith("dbc");
        boolean isStartWith = str.startsWith("abc");
        boolean isStartWithOffset = str.startsWith("abc", 5);

        String s2 = String.valueOf(i);
        String s3 = String.valueOf(1.1);
        String s4 = String.valueOf(chars);

        boolean isMatches = str.matches("\\d");
        String new_string = str.replaceFirst("\\d", "new string");
        String new_string1 = str.replaceAll("\\d", "new string");

        String[] split = str.split("/");
        String[] split1 = str.split("/", 3);

        for (String spl : split) {
            boolean isMatchesNew = spl.matches("\\d");
            if (isMatchesNew) {
                System.out.println(spl);
            }
        }
    }


}
