package Steps;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.core.Serenity;
import org.openqa.selenium.WebDriver;

public class MyStepdefs {

    private WebDriver driver;

    @Given("I do the first step")
    public void iDoTheFirstStep() {
        driver = Serenity.getDriver();
        driver.get("https://www.capriciicolorate.ro");
        System.out.println("Step 1 - successfully executed.");
    }

    @When("I do the second step")
    public void iDoTheSecondStep() {
        System.out.println("Step 2 - successfully executed.");
    }

    @And("I do the third step")
    public void iDoTheThirdStep() {
        System.out.println("Step 3 - successfully executed.");
    }

    @Then("I get a result")
    public void iGetAResult() {
        driver.quit();
        System.out.println("Step 4 - successfully executed.");
    }
}
