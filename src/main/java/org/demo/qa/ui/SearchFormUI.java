package org.demo.qa.ui;

import net.serenitybdd.screenplay.targets.Target;

public class SearchFormUI {

    private SearchFormUI() {
        throw new IllegalStateException("Utility class");
    }

    public static final Target SEARCH_FIELD = Target.the("search field").locatedBy("#searchbox_input");

}
