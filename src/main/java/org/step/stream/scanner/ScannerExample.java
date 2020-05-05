package org.step.stream.scanner;

import java.io.*;
import java.nio.channels.ReadableByteChannel;
import java.nio.charset.StandardCharsets;
import java.util.Scanner;

public class ScannerExample {

    public static void main(String[] args) throws IOException {
        File source = new File("text.txt");
        FileInputStream fileInputStream = new FileInputStream(source);
        Reader reader = new FileReader(source);

        Scanner first = new Scanner(source);
//        Scanner second = new Scanner(source, StandardCharsets.UTF_8);
        Scanner third = new Scanner("I'am string");
        Scanner fourth = new Scanner(fileInputStream);
//        Scanner fifth = new Scanner(fileInputStream, StandardCharsets.UTF_8);
        Scanner sixth = new Scanner(reader);

//        Scanner fromIn = new Scanner(System.in);
//
//        while (fromIn.hasNextInt()) {
//            System.out.println(fromIn.nextInt());
//        }

            while (fourth.hasNext()) {
                if (fourth.hasNextInt()) {
                    System.out.println("Int " + fourth.nextInt());
                } else if (fourth.hasNextDouble()) {
                    System.out.println("Double " + fourth.nextDouble());
                } else if (fourth.hasNextLine()) {
                    System.out.println("String " + fourth.nextLine());
                }
            }
    }
}
