package org.step;

public class StaticExample {

    public static final String CONSTANTA = "Constanta";
    public static String number;


    static {
        number = translateToString(123);
    }

    public final String get() {
        return "";
    }

    public static String translateToString(Integer integer) {
        return integer.toString();
    }


}
