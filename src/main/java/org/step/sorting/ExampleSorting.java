package org.step.sorting;

import org.step.Product;

import java.util.Arrays;
import java.util.NavigableSet;
import java.util.TreeSet;

public class ExampleSorting {

    public static void main(String[] args) {
        int[] ints = {1, 34, 5, 7, 5, 14};
        printArray(ints);
        Arrays.sort(ints);
        printArray(ints);

        Product firstProduct = new Product("abc");
        Product secondProduct = new Product("abcde");
        Product third = new Product("a");
        Product fourth = new Product("ab");


        CustomComparator customComparator = new CustomComparator();

        int compare = customComparator.compare(firstProduct, secondProduct);

        NavigableSet<Product> navigableSet = new TreeSet<>();

        navigableSet.add(firstProduct);
        navigableSet.add(secondProduct);
        navigableSet.add(third);
        navigableSet.add(fourth);

        for (Product product : navigableSet) {
            System.out.println(product.getProductName());
        }

        System.out.println(compare);
    }

    private static void printArray(int[] array) {
        for (Integer i : array) {
            System.out.println(i);
        }
    }
}
