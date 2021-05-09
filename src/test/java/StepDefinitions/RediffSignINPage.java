package StepDefinitions;

import Cucumber.Framework.Base;
import Cucumber.Framework.LoginPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class RediffSignINPage extends Base {
     
	

	@Given("user sets up the browser and navigate to url {string}")
	public void user_sets_up_the_browser_and_navigate_to_url(String URL) {
		// Write code here that turns the phrase above into concrete actions
		 driver=initializeDriver();
		driver.get(URL);
		driver.manage().window().maximize();

	}

	@Given("user clicks on signIn button")
	public void user_clicks_on_sign_in_button() {
		// Write code here that turns the phrase above into concrete actions
		LoginPage rd = new LoginPage(driver);
		rd.signingIn().click();

	}

	@When("user enters user name as {string} and password as {string}")
	public void user_enters_user_name_as_and_password_as(String string, String string2) {
		// Write code here that turns the phrase above into concrete actions
		LoginPage rd = new LoginPage(driver);
		rd.userNamevalue().sendKeys("krcharan");
		rd.password().sendKeys("password");
	}

	@When("clicks on LogIn button")
	public void clicks_on_log_in_button() {
		// Write code here that turns the phrase above into concrete actions
		LoginPage rd = new LoginPage(driver);
		rd.loginButton().click();
	}

	@Then("user clicks on rediff link")
	public void user_clicks_on_rediff_link() {
		// Write code here that turns the phrase above into concrete actions
		System.out.println("user clicks on rediff link");
	}

	@Then("searched items in rediff page")
	public void searched_items_in_rediff_page() {
		// Write code here that turns the phrase above into concrete actions
		System.out.println("searched items in rediff page");
	}

	@Then("navigates to child window and search with firstcompany name")
	public void navigates_to_child_window_and_search_with_firstcompany_name() {
		// Write code here that turns the phrase above into concrete actions
		System.out.println("navigates to child window and search with firstcompany name");
	}

}
