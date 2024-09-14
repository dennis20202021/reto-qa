package org.demo.qa.task;

import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Enter;
import org.demo.qa.ui.SearchFormUI;
import org.openqa.selenium.Keys;

public class LookForInformation {

    private LookForInformation() {
        throw new IllegalStateException("Utility class");
    }

    public static Performable about(String searchTerm) {
        return Task.where("{0} searches for '" + searchTerm + "'",
                Enter.theValue(searchTerm)
                        .into(SearchFormUI.SEARCH_FIELD)
                        .thenHit(Keys.ENTER)
        );
    }

}
