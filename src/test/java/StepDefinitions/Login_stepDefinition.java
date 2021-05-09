package StepDefinitions;

import org.junit.runner.RunWith;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.junit.Cucumber;

@RunWith(Cucumber.class)

public class Login_stepDefinition {
	
	@Given("user logs into page with username {string} and password {string}")
	public void user_logs_into_page_with_username_and_password(String string, String string2) {
	    // Write code here that turns the phrase above into concrete actions
	  System.out.println("user logs into page with username & password "+string+" "+ string2);
	}

	@When("^user is on netBanking login page$")
	public void user_is_on_net_banking_login_page() {
	    System.out.println("user is on netBanking login page");
	}

	@When("^user selects option as credit cards$")
	public void user_selects_option_as_credit_card() {
		System.out.println("user selects option as credit card");
	}

	@Then("^all the saved cards are populated$")
	public void all_the_saved_cards_are_populated() {
	    		System.out.println("all the saved cards are populated");
	}
}
