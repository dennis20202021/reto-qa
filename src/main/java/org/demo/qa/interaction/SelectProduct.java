package org.demo.qa.interaction;

public class SelectProduct {

    private SelectProduct() {
        throw new IllegalStateException("Utility class");
    }

    public static ImplementProduct byName(int scrollY, String name, String productName) {
        return new ImplementProduct(scrollY, name, productName);
    }

}
