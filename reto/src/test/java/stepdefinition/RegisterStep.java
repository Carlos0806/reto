package stepdefinition;

import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actions.Open;
import net.thucydides.core.annotations.Managed;
import org.openqa.selenium.WebDriver;
import task.FormatTask;
import task.RegisterTask;

import java.util.Map;

public class RegisterStep {

    Actor carlos= Actor.named("Carlos");

    @Managed (driver = "chrome")
    WebDriver hisDriver;

    @Before
    public void config() {
        carlos.can(BrowseTheWeb.with(hisDriver));
    }

    @Given("^I must open the website$")
    public void i_must_open_the_website()  {

        carlos.wasAbleTo(Open.url("https://www.utest.com/"));

    }

    @When("^I must register a user$")
    public void i_must_register_a_user(Map<String,String>data)  {

        carlos.attemptsTo(RegisterTask.register());
        carlos.attemptsTo(FormatTask.formOne(data));


    }

    @Then("^I must validate the text \"([^\"]*)\"$")
    public void i_must_validate_the_text_something(String strArg1)  {

    }

}
