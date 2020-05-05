package org.step.stream.readwritestream;

import java.io.*;
import java.nio.charset.StandardCharsets;

public class InputStreamWriterExample {

    public static void main(String[] args) throws IOException {

        Writer writer = new BufferedWriter(
                new OutputStreamWriter(
                    new FileOutputStream("text.txt"), StandardCharsets.UTF_8
        ));
        writer.write("abc");
        writer.close();
    }
}
