package org.demo.qa.question;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;
import net.serenitybdd.screenplay.waits.WaitUntil;
import org.demo.qa.ui.SanAngelHomePageUI;

import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isCurrentlyVisible;

public class PageTitle implements Question<String> {


    @Override
    public String answeredBy(Actor actor) {
        return new SanAngelHomePageUI().TITLE_PAGE;
    }

    public static PageTitle is() {
        return new PageTitle();
    }

}
