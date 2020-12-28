package starter.search;

import org.openqa.selenium.Keys;

import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Enter;

public class Google {
    public static Performable about(String keyWord) {
        return Task.where("{0} google for '" + keyWord + "'",
                Enter.theValue(keyWord)
                        .into(GoogleSearchForm.SEARCH_FIELD)
                        .thenHit(Keys.ENTER)
        );
    }
}
