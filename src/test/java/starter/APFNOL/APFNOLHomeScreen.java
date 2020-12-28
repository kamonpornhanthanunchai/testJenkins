package starter.APFNOL;

import org.openqa.selenium.By;

import net.serenitybdd.screenplay.targets.Target;

public class APFNOLHomeScreen {

//    public static final Target SEARCH_FIELD =  Target.the("FNOL search field").located(By.id("searchContract"));
	public static final Target SEARCH_FIELD =  Target.the("FNOL search field").locatedBy(".cdk-text-field-autofill-monitored.c-input");
    public static final Target NEXT_BUTTON =  Target.the("Next Button").locatedBy(".nx-button--primary.nx-button--medium.nx-button--block");
    public static final Target RESET_BUTTON =  Target.the("Next Button").locatedBy(".nx-button--secondary.nx-button--medium.nx-button--block");
}