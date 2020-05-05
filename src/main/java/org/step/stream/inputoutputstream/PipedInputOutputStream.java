package org.step.stream.inputoutputstream;

import java.io.IOException;
import java.io.PipedInputStream;
import java.io.PipedOutputStream;

public class PipedInputOutputStream {

    public static void main(String[] args) {

        try (PipedInputStream input = new PipedInputStream();
            PipedOutputStream output = new PipedOutputStream(input)) {

            int countRead = 0;
            int[] toRead = null;

            for (int i = 0; i < 20; i++) {
                output.write(i);
            }
            int available = input.available();
            System.out.println("Available to read: " + available);

            toRead = new int[available];
            for (int i = 0; i < available; i++) {
                toRead[i] = input.read();
                System.out.println(toRead[i] + " ");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
