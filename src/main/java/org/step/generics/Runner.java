package org.step.generics;

import org.step.Product;

import java.util.ArrayList;
import java.util.List;

public class Runner {

    public static void main(String[] args) {
        Message message = new Message();
        Object id = message.id;
        String exampleFirst = (String) id;
        Integer exampleSecond = (Integer) id;
        Product product = (Product) id;

        MetaClass<Integer> metaClass = new MetaClass<>(1);
        metaClass.sameType(new MetaClass<Integer>(1));
        metaClass.same(new MetaClass<Double>(1.1));

        Object content = message.content;

        Message<Long, String> goodMessage = new Message<>();
        Long id1 = goodMessage.id;
        String content1 = goodMessage.content;

        List arrayList = new ArrayList();
        arrayList.add(id);
        arrayList.add(exampleFirst);
        arrayList.add(exampleSecond);
        arrayList.add(product);

        for (Object p : arrayList) {
            Product p1 = (Product) p;
            System.out.println(p1.getProductName());
        }
    }
}
