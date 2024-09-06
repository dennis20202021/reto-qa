package starter.ui;

import net.serenitybdd.screenplay.targets.Target;

public class SearchArticleUI {

    private SearchArticleUI() {
        throw new IllegalStateException("Utility class");
      }

    public static final Target BODY =  Target.the("article identifier").locatedBy("//article");
}
