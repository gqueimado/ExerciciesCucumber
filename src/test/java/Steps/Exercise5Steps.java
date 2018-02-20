package Steps;

import Base.BaseUtil;
import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import org.openqa.selenium.By;

public class Exercise5Steps extends BaseUtil {
    @Given("^i am at toolsqa page$")
    public void iAmAtToolsqaPage() throws Throwable {
        openBrowser();
        driver.get("http://toolsqa.wpengine.com/automation-practice-form/");
    }

    @And("^type the first and last name$")
    public void typeTheFirstAndLastName() throws Throwable {
        driver.findElement(By.name("firstname")).sendKeys("Goncalo");
        driver.findElement(By.name("lastname")).sendKeys("Zé");
    }

    @And("^click on submit button$")
    public void clickOnSubmitButton() throws Throwable {
        driver.findElement(By.id("submit")).click();
        driver.close();
    }
}
