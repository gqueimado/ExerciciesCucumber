package Steps;

import Base.BaseUtil;
import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import java.util.concurrent.TimeUnit;

public class Exercise4Steps extends BaseUtil {
    @Given("^i am at alten page$")
    public void iAmAtAltenPage() throws Throwable {
     openBrowser();
     driver.get("http://www.alten.com");
    }

    @When("^i do a mousehovering and click$")
    public void iDoAMousehoveringAndClick() throws Throwable {
        Thread.sleep(2000);
        Actions action = new Actions(driver);
        WebElement we = driver.findElement(By.xpath("//a[text()='Sectors' and @href='#']//ancestor::li[@id='menu-item-2893']"));
        action.moveToElement(we).moveToElement((driver.findElement(By.xpath("//a[@href='http://www.alten.com/operations/the-technology-partner/telecoms']//ancestor::li[@id='menu-item-2897']")))).click().build().perform();


        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }

    @Then("^i am redirect to a new page$")
    public void iAmRedirectToANewPage() throws Throwable {
        driver.findElement(By.xpath("//h2[text()='Telecoms']")).isDisplayed();
        closeBrowser();
    }
}
