package com.careerit.jfs.cj.day14;

public class ProductManager {

    public final static void main(final String... args) {
        Product product = new Product(1001,"Dell Laptop",45000);
        product.showInfo();

        Product updateProduct = product.updatePrice(40000);
        updateProduct.showInfo();


    }

}
