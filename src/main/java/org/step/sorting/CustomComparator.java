package org.step.sorting;

import org.step.Product;

import java.util.Comparator;

public class CustomComparator implements Comparator<Product> {

    @Override
    public int compare(Product firstProduct, Product secondProduct) {
        return firstProduct.getProductName().length() - secondProduct.getProductName().length();
    }
}
