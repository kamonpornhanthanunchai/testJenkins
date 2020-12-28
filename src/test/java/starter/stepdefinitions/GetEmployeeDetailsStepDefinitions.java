package starter.stepdefinitions;

import static net.serenitybdd.rest.SerenityRest.restAssuredThat;

import org.apache.hc.core5.http.HttpStatus;

import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.rest.SerenityRest;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import net.serenitybdd.screenplay.rest.abilities.CallAnApi;
import net.serenitybdd.screenplay.rest.interactions.Ensure;
import net.serenitybdd.screenplay.rest.interactions.Get;

import static org.hamcrest.Matchers.*;

public class GetEmployeeDetailsStepDefinitions {

	@Before
	public void setTheStage() {
		OnStage.setTheStage(new OnlineCast());
	}

//	private static String theRestApiBaseUrl;
//	private static EnvironmentVariables environmentVariables;
//
//	@BeforeClass
//	public static void configureBaseURL() {
//		theRestApiBaseUrl = environmentVariables.optionalProperty("restapi.baseurl")
//				.orElse("http://dummy.restapiexample.com/api/v1");
//	}
	
	@Given("{actor} is getting employee details")
	public void is_getting_employee_details(Actor actor) {
//		 SerenityRest.given()
//         .baseUri("http://dummy.restapiexample.com/api/v1");

		System.out.println("1");
		//use this one
		//actor.whoCan(CallAnApi.at("http://dummy.restapiexample.com/api/v1"));
	}

	@When("{actor} requests for details of employee {string}")
	public void requests_for_details_of_employee(Actor actor, String employeeID) {
//		SerenityRest.when().get("http://dummy.restapiexample.com/api/v1"+"/employee/" + employeeID);

		System.out.println("2");
		//use this one
//		actor.attemptsTo(
//	            Get.resource("/employee/" + employeeID)
//	    );
	}

	@Then("{actor} should get employee details")
	public void should_get_employee_details(Actor actor) {
//		actor.attemptsTo(Ensure.that());
//		actor.should(seeThat(LastResponse.received(), true)));

//		restAssuredThat(response -> response
//                .statusCode(HttpStatus.SC_OK));

		System.out.println("3");
		//use this one
//		actor.attemptsTo(Ensure.that("user get employee details", 
//				response -> response
//				.statusCode(200)
//				.body("data.employee_name", equalTo("Tiger Nixon"))
//				.body("data.employee_salary", equalTo(320800))
//				.body("data.employee_age", equalTo(61))));

//		actor.should(
//	            seeThatResponse("all the expected users should be returned",
//	                    response -> response.statusCode(200)
//	                                        .body("data.first_name", hasItems("George", "Janet", "Emma")))
	}
}
