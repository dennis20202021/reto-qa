package org.demo.qa.ui;

import net.serenitybdd.annotations.DefaultUrl;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

@DefaultUrl("page:sanangel.base.url")
public class SanAngelHomePageUI extends PageObject {

    public final String TITLE_PAGE = getDriver().getTitle();

    public static final Target SLIDE_IMAGE = Target.the("Slide Image").locatedBy("//div[@data-sstype='slide']");

}
