package org.step.filter;

import org.step.Product;

import java.util.List;

public abstract class GoodsFilter {

    private boolean isActive;

    public GoodsFilter(boolean isActive) {
        this.isActive = isActive;
    }

    public abstract List<Product> filter(List<Product> products);

    public boolean isActive() {
        return isActive;
    }
}
