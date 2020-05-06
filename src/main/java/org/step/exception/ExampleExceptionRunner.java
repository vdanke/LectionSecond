package org.step.exception;

import org.step.exception.custom.FileIsEmptyException;
import org.step.exception.custom.IOInterceptorException;

import java.io.*;
import java.util.stream.Collectors;

/*
    Throwable -> Error
    Throwable -> Exception
    Exception -> RuntimeException
 */
public class ExampleExceptionRunner {

    public static void main(String[] args) throws IOInterceptorException {
        File file = new File("text.txt");
        ExampleExceptionRunner example = new ExampleExceptionRunner();
        String fromFile;
        try {
            fromFile = example.readFile(file);
        } catch (IOException e) {
            throw new IOInterceptorException(e);
        }

        if (fromFile.equals("")) {
            throw new FileIsEmptyException("Something is wrong, fix it!!!");
        }
    }

    private String readFile(File file) throws IOException, NullPointerException, IllegalArgumentException {
        String fromFile = "";
        Reader reader = null;
        try {
            reader = new FileReader(file);

            BufferedReader bufferedReader = new BufferedReader(reader);

            fromFile = bufferedReader.lines().collect(Collectors.joining("\n"));

//            while ((fromFile = bufferedReader.readLine()) != null) {
//                fromFile = fromFile + bufferedReader.readLine();
//            }
        } catch (Exception e) {
            e.getMessage();
            e.printStackTrace();
            e.getLocalizedMessage();
            Throwable cause = e.getCause();
            cause.getMessage();
        } finally {
            reader.close();
        }
        return fromFile;
    }
}
