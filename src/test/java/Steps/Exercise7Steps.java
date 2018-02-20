package Steps;

import Base.BaseUtil;
import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Exercise7Steps extends BaseUtil{
    @Given("^i am at example page$")
    public void iAmAtExamplePage() throws Throwable {
        openBrowser();
        driver.get("http://the-internet.herokuapp.com/windows");

    }

    @And("^click on another window$")
    public void clickOnAnotherWindow() throws Throwable {
        driver.findElement(By.xpath("//a[@href='/windows/new']")).click();
}

    @And("^change the focus to the new tab$")
    public void changeTheFocusToTheNewTab() throws Throwable {

        for (String winHandle : driver.getWindowHandles()) {
            driver.switchTo().window(winHandle); // switch focus of WebDriver to the next found window handle (that's your newly opened window)
        }
    }

    @Then("^the focus is at the new page$")
    public void theFocusIsAtTheNewPage() throws Throwable {
        driver.findElement(By.xpath("//h3[text()='New Window']")).isDisplayed();
        quitBrowser();
    }
}
