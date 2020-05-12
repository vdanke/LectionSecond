package org.step.multithreading;

import java.util.Properties;
import java.util.ResourceBundle;
import java.util.concurrent.Callable;

public class Run implements Callable<String> {

    ResourceBundle resourceBundle = ResourceBundle.getBundle("db");

    @Override
    public String call() throws Exception {
        Thread.sleep(1000);
        String key = resourceBundle.getString("key");

        System.out.println(key);
        return "I'am done";
    }
}
