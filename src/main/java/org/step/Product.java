package org.step;

public class Product implements Comparable<Product> {

    private String productName;

    public Product(String productName) {
        this.productName = productName;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    @Override
    public int compareTo(Product otherProduct) {
        int otherProductNameLength = otherProduct.getProductName().length();
        return this.productName.length() - otherProductNameLength;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        Product incomingProduct = (Product) obj;
        if (incomingProduct.getProductName() == null) {
            return false;
        }
        if (this.productName.equals(incomingProduct.productName)) {
            return true;
        } else {
            return false;
        }
    }

    @Override
    public int hashCode() {
        final int scaleNumber = 31;

        if (this.productName != null) {
            return scaleNumber * this.productName.hashCode();
        }
        return scaleNumber;
    }
}
