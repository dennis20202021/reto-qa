package org.demo.qa.task;

import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Open;
import org.demo.qa.ui.DuckDuckGoHomePageUI;

public class NavigateTo {

    private NavigateTo() {
        throw new IllegalStateException("Utility class");
    }

    public static Performable theSearchHomePage() {
        return Task.where("{0} opens the DuckDuckGo home page",
                Open.browserOn().the(DuckDuckGoHomePageUI.class));
    }

}
