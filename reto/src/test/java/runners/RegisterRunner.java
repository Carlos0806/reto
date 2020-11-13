package runners;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)

@CucumberOptions(

        features = "src/test/resources/features/Register.feature",
        glue = "src/test/java/stepdefinition",
        snippets = SnippetType.CAMELCASE

)

public class RegisterRunner {
}
