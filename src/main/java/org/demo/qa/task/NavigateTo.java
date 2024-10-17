package org.demo.qa.task;

import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Open;
import org.demo.qa.ui.SanAngelHomePageUI;

public class NavigateTo {

    private NavigateTo() {
        throw new IllegalStateException("Utility class");
    }

    public static Performable sanAngelWebsite() {
        return Task.where("{0} opens the San Angel home page",
                Open.browserOn().the(SanAngelHomePageUI.class));
    }

}
