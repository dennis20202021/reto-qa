package org.demo.qa.task;

import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.waits.WaitUntil;
import org.demo.qa.interaction.Scroll;
import org.demo.qa.interaction.SelectProduct;
import org.demo.qa.ui.ProductCatalogue;
import org.demo.qa.ui.SanAngelHomePageUI;

import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isCurrentlyVisible;

public class AddProducts {

    private AddProducts() {
        throw new IllegalStateException("Utility class");
    }

    public static Performable withQuantity(int product, int quantity) {
        return Task.where(
                "{0} add " + product + " product(s) with " + quantity + " quantities",
                WaitUntil.the(SanAngelHomePageUI.SLIDE_IMAGE, isCurrentlyVisible()),
                Click.on(SanAngelHomePageUI.SLIDE_IMAGE),
                SelectProduct.byName(425, "Cesta de amor Flowers", "Cesta de amor")
        );
    }

}
