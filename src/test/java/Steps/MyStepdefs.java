package Steps;

import io.cucumber.java.AfterAll;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.core.Serenity;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.RemoteWebDriver;

import java.net.MalformedURLException;
import java.net.URL;

public class MyStepdefs {

    private final WebDriver driver = Serenity.getDriver();

    public MyStepdefs(){}


    @Given("I do the first step")
    public void iDoTheFirstStep() {
        driver.get("https://www.capriciicolorate.ro");
    }

    @When("I do the second step")
    public void iDoTheSecondStep() {
        Assert.assertEquals("Capricii Colorate – love, crafted.", driver.getTitle());
    }

    @And("I do the third step")
    public void iDoTheThirdStep() {
        driver.findElement(By.xpath("//p[contains(text(),'- love, crafted.')]")).isDisplayed();
    }

    @Then("I get a result")
    public void iGetAResult() {
        driver.findElement(By.xpath("//a/*[contains(text(),'magazin')]/..")).click();
        driver.findElement(By.xpath("//*[contains(text(),'Cantaloupe')]")).isDisplayed();
        driver.quit();
    }
}
