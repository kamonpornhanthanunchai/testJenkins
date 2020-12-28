package starter.stepdefinitions;

import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import net.serenitybdd.screenplay.ensure.Ensure;
import net.serenitybdd.screenplay.matchers.WebElementStateMatchers;
import net.serenitybdd.screenplay.waits.WaitUntil;
import starter.APFNOL.APFNOLHomeScreen;
import starter.APFNOL.ProcessTo;
import starter.APFNOL.QuestionnaireScreen;
import starter.APFNOL.Reset;
import starter.navigation.NavigateTo;
import starter.search.SearchForContract;

public class APFNOLStepDefinitions {

	@Before
	public void setTheStage() {
		OnStage.setTheStage(new OnlineCast());
	}

	@Given("{actor} is access to APFNOL website")
	public void is_access_to_apfnol_website(final Actor actor) {
		actor.wasAbleTo(NavigateTo.theAPFNOLHomePage());
	}

	@Then("{actor} should reach the searching screen")
	public void should_reach_the_searching_screen(final Actor actor) {
		theActorInTheSpotlight()
				.attemptsTo((WaitUntil.the(APFNOLHomeScreen.SEARCH_FIELD, WebElementStateMatchers.isVisible()))
						.then(Ensure.that(APFNOLHomeScreen.NEXT_BUTTON).isDisplayed()));
	}

	@When("{actor} want to continue to questionnaire screen")
	public void want_to_continue_to_questionnaire_screen(final Actor actor) {
		theActorInTheSpotlight().attemptsTo(ProcessTo.QuestionnaireScreen());
	}

	@Then("{actor} should see questionnaire form")
	public void should_see_questionnaire_form(final Actor actor) {
		theActorInTheSpotlight().attemptsTo(
				(WaitUntil.the(QuestionnaireScreen.FIRST_QUESTION_DROPDOWN, WebElementStateMatchers.isVisible()))
						.then(Ensure.that(QuestionnaireScreen.RESET_BUTTON).isDisplayed()));
	}

	@When("{actor} want to reset all progress")
	public void want_to_reset_all_progress(final Actor actor) {
		theActorInTheSpotlight().attemptsTo(Reset.AllAction());
	}

	@When("he want to search for contract number {string}")
	public void he_want_to_search_for_contract_number(final String contractNum) {
		theActorInTheSpotlight().attemptsTo(SearchForContract.number(contractNum));
	}

	@Then("contract field should be empty")
	public void contract_field_should_be_empty() {
		theActorInTheSpotlight().attemptsTo(
				(WaitUntil.the(APFNOLHomeScreen.SEARCH_FIELD, WebElementStateMatchers.isVisible()))
						.then(Ensure.that(APFNOLHomeScreen.SEARCH_FIELD).value().isEmpty()));
	}

	@Then("{actor} should return to searching screen")
	public void should_return_to_searching_screen(final Actor actor) {
		theActorInTheSpotlight()
				.attemptsTo((WaitUntil.the(APFNOLHomeScreen.SEARCH_FIELD, WebElementStateMatchers.isVisible()))
						.then(Ensure.that(APFNOLHomeScreen.NEXT_BUTTON).isNotDisplayed()));
	}
}
