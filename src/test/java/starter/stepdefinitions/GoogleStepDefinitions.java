package starter.stepdefinitions;

import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import net.serenitybdd.screenplay.ensure.Ensure;
import starter.navigation.NavigateTo;
import starter.search.Google;
import starter.search.GoogleSearchResult;

public class GoogleStepDefinitions {

	@Before
	public void setTheStage() {
		OnStage.setTheStage(new OnlineCast());
	}

	@Given("{actor} is researching things on Google")
	public void is_researching_things_on_google(Actor actor) {
		actor.wasAbleTo(NavigateTo.googlePage());
	}

	@When("{actor} search for {string}")
	public void google_search_for(Actor actor, String keyWord) {
		actor.attemptsTo(Google.about(keyWord));
	}

	@Then("{actor} should get information about {string}")
	public void google_should_displayed_information_about(Actor actor, String keyWord) {
		actor.attemptsTo(Ensure.that(GoogleSearchResult.SEARCH_RESULTHEADING).text().contains("Ham"));
	}

}
