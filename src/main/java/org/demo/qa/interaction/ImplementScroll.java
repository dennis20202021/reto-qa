package org.demo.qa.interaction;

import net.serenitybdd.screenplay.Actor;

public class ImplementScroll extends ScrollScript {

    private final int y;

    public ImplementScroll(int y) {
        this.y = y;
    }

    @Override
    public <T extends Actor> void performAs(T t) {
        performScrollIntoView(t, y);
    }

}
