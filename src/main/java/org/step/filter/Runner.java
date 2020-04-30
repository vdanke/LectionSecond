package org.step.filter;

public class Runner {

    public static void main(String[] args) {
        GoodsFilterInterface goodsFilterInterface = new GoodsFilterInterface() {
            @Override
            public String productName() {
                return "This is link string";
            }
        };

        System.out.println(goodsFilterInterface.productName());
    }
}
