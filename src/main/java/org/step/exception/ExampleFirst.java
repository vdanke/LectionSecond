package org.step.exception;

public class ExampleFirst {

    public static void main(String[] args) {
        try {
            int i = 42;
            int z = args.length;

            int p = i / z;
            int[] array = new int[z];
            array[z] = 777;
            System.out.println("Successful");
        } catch (ArithmeticException | ArrayIndexOutOfBoundsException e) {
            System.out.println("Null in invalid");
        }
//        } catch (ArrayIndexOutOfBoundsException ex) {
//            ex.printStackTrace();
//        }
        System.out.println("After try-catch block");
    }
}
