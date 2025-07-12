package stepdefs;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;

public class LoginSteps {
    @Given("User is on login page")
    public void user_on_login_page() {
        System.out.println("User on login page");
    }

    @When("User enters valid credentials")
    public void user_enters_valid_credentials() {
        System.out.println("User enters credentials");
    }

    @Then("User is navigated to the home page")
    public void user_is_navigated_to_home_page() {
        System.out.println("User navigated to home");
    }
}
