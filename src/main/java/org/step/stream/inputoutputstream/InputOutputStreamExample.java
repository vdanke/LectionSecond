package org.step.stream.inputoutputstream;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.util.Arrays;

public class InputOutputStreamExample {

    public static void main(String[] args) {
        byte[] bytes = new byte[]{1, -1, 0};

        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bytes);

        int first = byteArrayInputStream.read();
        System.out.println("First element: " + first);
        int second = byteArrayInputStream.read();
        System.out.println("Second element: " + second);
        int third = byteArrayInputStream.read();
        System.out.println("Third element: " + third);

        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        byteArrayOutputStream.write(10);
        byteArrayOutputStream.write(11);

        byte[] fromOutputStream = byteArrayOutputStream.toByteArray();

        System.out.println(Arrays.toString(fromOutputStream));
    }
}
