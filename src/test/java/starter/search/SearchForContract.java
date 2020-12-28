package starter.search;

import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import starter.APFNOL.APFNOLHomeScreen;

public class SearchForContract {
    public static Performable number(String contractNum) {
        return Task.where("{0} search on contract with number '" + contractNum + "'",
                Enter.theValue(contractNum)
                        .into(APFNOLHomeScreen.SEARCH_FIELD)
                        .then(Click.on(APFNOLHomeScreen.NEXT_BUTTON))
        );
    }
}
