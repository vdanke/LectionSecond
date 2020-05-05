package org.step.stream.readwritestream;

import java.io.CharArrayReader;
import java.io.CharArrayWriter;
import java.io.IOException;

public class CharArrayReaderExample {

    public static void main(String[] args) throws IOException {
        String tmp = "abcsdkqejrejwehfkjnsf";
        int length = tmp.length();

        char[] chars = new char[length];

        tmp.getChars(0, length, chars, 0);

        try (CharArrayReader firstReader = new CharArrayReader(chars);
             CharArrayReader secondReader = new CharArrayReader(chars, 0, 5)) {

            int i = 0;
            System.out.println("First reader");
            while ((i = firstReader.read()) != -1) {
                System.out.println((char) i);
            }
            System.out.println("Second reader");
            while ((i = secondReader.read()) != -1) {
                System.out.println((char) i);
            }
            System.out.println();
        }
    }
}
