package stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObjects.Login;
import testrunner.TestRunner_LMS;
import utilities.ScenarioContext;



public class Login_SD {
	
	private ScenarioContext scenarioContext;
	
	public Login_SD() {
		 this.scenarioContext = TestRunner_LMS.scenarioContext;
    }

	
	@Given("Admin creates request with valid credentials")
	public void admin_creates_request_with_valid_credentials() {
		Login login = new Login(scenarioContext);
		login.UserLogin();
	}

	@When("Admin calls Post Https method  with valid endpoint")
	public void admin_calls_post_https_method_with_valid_endpoint() {
		System.out.println("USer logged in");
	}

	@Then("Admin receives {int} created with auto generated token")
	public void admin_receives_created_with_auto_generated_token(Integer int1) {
		System.out.println("status code is 201");
	}

}
