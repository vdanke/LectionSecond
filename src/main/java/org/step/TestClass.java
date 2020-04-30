package org.step;

import org.step.filter.GoodsFilter;
import org.step.filter.ProductNameFilter;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class TestClass {

    {
        // Some initialization
    }

    public static void main(String[] args) {
        List<Product> productList = new ArrayList<>();
        productList.add(new Product("shoes"));
        productList.add(new Product("gloves"));

        GoodsFilter productNameFilter = new ProductNameFilter(true, "");
        boolean active = productNameFilter.isActive();

        System.out.println(active);

        for (Product product : productList) {
            System.out.println(product.getProductName());
        }

        String constanta = StaticExample.CONSTANTA;
        String s = StaticExample.translateToString(123);
        System.out.println("Hello world!");

        TestClass testClass = new TestClass();
        testClass.testMethod();
    }

    public void printSomething(int i) {

    }

    public int printSomething(String str) {
        return 0;
    }

    public static int printSomething() {
        return 0;
    }

    public void testMethod() {
    }
}