package org.step.stream.readwritestream;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ReadJavaClass {

    public static void main(String[] args) {
        try (FileReader reader = new FileReader("src/main/java/org/step/bundle/LocaleImpl.java");
             BufferedReader bufferedReader = new BufferedReader(reader)) {
            String str;
            int i;

//            while ((i = bufferedReader.read()) != -1) {
//                System.out.println((char) i);
//            }

//            Stream<String> lines = bufferedReader.lines();
//            String collect = lines.collect(Collectors.joining("\n"));
//            System.out.println(collect);
//
            while ((str = bufferedReader.readLine()) != null) {
                System.out.println(str);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
