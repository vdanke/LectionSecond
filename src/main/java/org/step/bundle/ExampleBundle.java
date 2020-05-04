package org.step.bundle;

import java.util.Locale;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ExampleBundle {

    public static void main(String[] args) {
        LocaleImpl locale = new LocaleImpl(new Locale("ru", "BY"));

        String greetings = locale.getValue("greetings");

        System.out.println(greetings);

        String iin = "123456789123";

        Pattern compile = Pattern.compile("\\d");

        Matcher matcher = compile.matcher(iin);

        if (matcher.matches()) {

        }
    }
}
