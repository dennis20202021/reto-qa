package org.demo.qa.interaction;

import net.serenitybdd.screenplay.Actor;

public class ImplementProduct extends ProductScript{

    private final int scrollY;

    private final String name;

    private final String productName;

    public ImplementProduct(int scrollY, String name, String productName) {
        this.scrollY = scrollY;
        this.name = name;
        this.productName = productName;
    }

    @Override
    public <T extends Actor> void performAs(T t) {
        selectProductByName(t, scrollY, name, productName);
    }

}
