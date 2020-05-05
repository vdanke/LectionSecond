package org.step.stream.inputoutputstream;

import java.io.*;

public class IOStreamExample {

    public static void main(String[] args) throws IOException {
//        try {
            FileWriter fileWriter = new FileWriter("text.txt");

            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);

            PrintWriter printWriter = new PrintWriter(bufferedWriter);

            printWriter.println("This is sentence in txt file");

            printWriter.close();
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
    }

    private static void exampleInputStream() throws IOException {
        byte[] bytes = new byte[1234];
        InputStream inputStream = new ByteArrayInputStream(bytes);

        int read2 = inputStream.read();
        int read1 = inputStream.read(bytes);
        int read = inputStream.read(bytes, 5, bytes.length);

        int available = inputStream.available();

        long skip = inputStream.skip(5000);

        boolean isMarkSupported = inputStream.markSupported();

        if (isMarkSupported) {
            inputStream.mark(read);
        }

        inputStream.reset();

        inputStream.close();
    }

    private static void exampleOutputStream() throws IOException {
        byte[] bytes = new byte[1234];
        OutputStream outputStream = new ByteArrayOutputStream();

        outputStream.write(1);
        outputStream.write(bytes);
        outputStream.write(bytes, 5, bytes.length);

        outputStream.flush();
        outputStream.close();
    }
}
