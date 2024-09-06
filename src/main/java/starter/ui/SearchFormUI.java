package starter.ui;

import net.serenitybdd.screenplay.targets.Target;

public class SearchFormUI {

    private SearchFormUI() {
        throw new IllegalStateException("Utility class");
    }

    public static Target SEARCH_FIELD = Target.the("search field").locatedBy("#searchbox_input");

}
