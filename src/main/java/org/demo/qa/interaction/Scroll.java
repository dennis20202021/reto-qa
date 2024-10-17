package org.demo.qa.interaction;

public class Scroll {

    private Scroll() {
        throw new IllegalStateException("Utility class");
    }

    public static ImplementScroll to(int y) {
        return new ImplementScroll(y);
    }

}
