package starter.navigation;

import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Open;

public class NavigateTo {

    public static Performable theWikipediaHomePage() {
        return Task.where("{0} opens the Wikipedia home page",
                Open.browserOn().the(WikipediaHomePage.class));
    }

    public static Performable googlePage() {
        return Task.where("{0} opens Google",
                Open.browserOn().the(GooglePage.class));
    }

    public static Performable theAPFNOLHomePage() {
        return Task.where("{0} opens APFNOL Homepage",
                Open.browserOn().the(APFNOLPage.class));
    }
}
