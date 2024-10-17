package org.demo.qa.interaction;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;

public abstract class ScrollScript implements Interaction {

    protected void performScrollIntoView(Actor actor, int y) {
        BrowseTheWeb.as(actor).evaluateJavascript("window.scrollBy(0," + y + ")", "");
    }

}
