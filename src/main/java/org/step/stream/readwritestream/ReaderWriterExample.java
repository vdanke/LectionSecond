package org.step.stream.readwritestream;

import java.io.*;

public class ReaderWriterExample {

    public static void main(String[] args) throws IOException {
        char[] chars = new char[1234];

        Reader reader = new FileReader("text.txt");

        int read = reader.read();
        int read1 = reader.read(chars);
        int read2 = reader.read(chars, 0, chars.length);

        boolean isMarkSupported = reader.markSupported();

        reader.mark(read);

        reader.reset();

        boolean isReady = reader.ready();

        long skip = reader.skip(10);
    }

    private static void writeExample() throws IOException {
        Writer writer = new FileWriter("text.txt");

        writer.write(1);
        writer.write("abc");
        writer.write(new char[]{'a', 'b', 'c'});
        writer.write("abcd", 3, "abc".length());
        writer.write(new char[]{'a', 'b', 'c'}, 1, 3);
    }
}
