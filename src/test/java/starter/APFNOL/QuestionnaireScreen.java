package starter.APFNOL;

import org.openqa.selenium.By;

import net.serenitybdd.screenplay.targets.Target;

public class QuestionnaireScreen {

    public static final Target FIRST_QUESTION_DROPDOWN =  Target.the("First question").located(By.id("question1"));
    public static final Target RESET_BUTTON =  Target.the("Reset Button").locatedBy(".nx-button--secondary.nx-button--medium.nx-button--block");
}