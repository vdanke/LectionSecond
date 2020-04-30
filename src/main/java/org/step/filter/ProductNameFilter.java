package org.step.filter;

import org.step.Product;

import java.util.List;
import java.util.stream.Collectors;

public class ProductNameFilter extends GoodsFilter implements GoodsFilterInterface, IsActiveInterface {

    private String productName;

    public ProductNameFilter(boolean isActive, String productName) {
        super(isActive);
        this.productName = productName;
    }

    @Override
    public String productName() {
        return this.productName;
    }

    @Override
    public List<Product> filter(List<Product> products) {
//        List<Product> productList = new ArrayList<>();
//
//        for (Product product : products) {
//            if (product.getProductName().contains(this.productName)) {
//                productList.add(product);
//            }
//        }
        return products.stream()
                .filter(product -> product.getProductName().contains(this.productName))
                .collect(Collectors.toList());
    }
}
