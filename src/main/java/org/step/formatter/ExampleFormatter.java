package org.step.formatter;

import java.io.File;
import java.io.IOException;
import java.nio.charset.Charset;
import java.util.Formatter;
import java.util.Locale;
import java.util.Timer;

public class ExampleFormatter {

    public static void main(String[] args) {

    }

    private static void exampleFormatter(int port) throws IOException {
        Formatter formatter = new Formatter(Locale.CHINA);
        Formatter first = new Formatter();
        Formatter second = new Formatter(new File(""));

        String format = String.format("I'am number %d %c %s %h", 1, 'c', "string", new Timer());
        System.out.printf("I'am number %d", 1);

        String format2 = String.format("http://localhost:%d/", port);

        Formatter format1 = first.format("I'am number %d", 1);

        Appendable out = format1.out();
        out.append('c');
        String s = out.toString();
    }
}
