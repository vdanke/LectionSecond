package org.step;

public class SingletonExample {

    private static SingletonExample instance;

    private SingletonExample() {
    }

    public synchronized static SingletonExample getInstance() {
        if (instance == null) {
            instance = new SingletonExample();
        }
        return instance;
    }

    public String getString(String str, Integer... integers) {
        Integer[] integers1 = integers;
        return "";
    }

    public Integer getInteger(Integer i, String[]... strings) {
        String[][] strings1 = strings;
        return 0;
    }
}
