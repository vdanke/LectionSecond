package org.step.bundle;

import java.util.Locale;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ExampleBundle {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        LocaleImpl locale = new LocaleImpl();

        boolean isNextInt = scanner.hasNextInt();

        if (isNextInt) {
            switch (scanner.nextInt()) {
                case 1:
                    locale.setLocale(new Locale("ru", "RU"));
                    break;
                case 2:
                    locale.setLocale(new Locale("en", "US"));
                    break;
                case 3:
                    locale.setLocale(new Locale("ru", "BY"));
                    break;
                default:
                    throw new IllegalArgumentException("Should be 1 to 3");
            }
        }
        String greetings = locale.getValue("greetings");

        System.out.println(greetings);

        String iin = "123456789123";

        Pattern compile = Pattern.compile("\\d");

        Matcher matcher = compile.matcher(iin);

        if (matcher.matches()) {

        }
    }
}
