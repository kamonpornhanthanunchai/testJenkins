package starter.APFNOL;

import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;

public class ProcessTo {

    public static Performable QuestionnaireScreen() {
        return Task.where("{0} continue to Questionnaire screen",
                Click.on(APFNOLHomeScreen.NEXT_BUTTON)
                );
    }
}
