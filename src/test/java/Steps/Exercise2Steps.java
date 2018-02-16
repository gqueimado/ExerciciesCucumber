package Steps;

import Base.BaseUtil;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.By;

public class Exercise2Steps extends BaseUtil {


    @Given("^I am at Windows demoqa page$")
    public void iAmAtDemoqaPage() throws Throwable {
       openBrowser();
        driver.get("http://demoqa.com/frames-and-windows/");
    }

    @When("^I Click on new Window button$")
    public void iClickOnNewWindowButton() throws Throwable {
        driver.findElement(By.xpath("//*[@id='tabs-1']/div/p/a")).click();
    }

    @Then("^Appears a new Window$")
    public void appearsANewWindow() throws Throwable {
        System.out.println("User Name");
        quitBrowser();

}

}
