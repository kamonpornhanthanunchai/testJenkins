package starter.APFNOL;

import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;

public class Reset {

    public static Performable AllAction() {
        return Task.where("{0} reset all action",
                Click.on(QuestionnaireScreen.RESET_BUTTON)
//                Click.on(APFNOLHomeScreen.RESET_BUTTON)
                );
    }
}
