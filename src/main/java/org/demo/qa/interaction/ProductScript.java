package org.demo.qa.interaction;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.targets.Target;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isCurrentlyVisible;

public abstract class ProductScript implements Interaction {

    protected void selectProductByName(Actor actor, int scrollY, String name, String productName) {
        String selectorXpath = "//*[contains(text(), '" + productName + "')]/parent::a";
        Target PRODUCT = Target.the(name).locatedBy(selectorXpath);
         actor.attemptsTo(
                 Scroll.to(scrollY),
                 WaitUntil.the(PRODUCT, isCurrentlyVisible()),
                 Click.on(PRODUCT)
         );
    }

}
