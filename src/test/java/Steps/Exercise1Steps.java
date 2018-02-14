package Steps;

import Base.BaseUtil;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Test;

public class Exercise1Steps extends BaseUtil {
   String url, Current;

    @Test
    @Given("^I am at demoqa page$")
    public void iAmAtDemoqaPage() throws Throwable {

        openBrowser();
        url = "http://www.store.demoqa.com";
        driver.get(url);
        String Title = driver.getTitle();
        int TitleLenght = driver.getTitle().length();
        System.out.println(Title);
        System.out.println(TitleLenght);
         Current = driver.getCurrentUrl();
    }

    @When("^Do Stuff$")
    public void doStuff() throws Throwable {

        if (url == Current) {
            System.out.println("Verification Successful - The correct Url is opened.");
        } else {
            System.out.println("Verification Failed - An incorrect Url is opened.");
            //In case of Fail, you like to print the actual and expected URL for the record purpose
            System.out.println("Actual URL is : " + Current);
            System.out.println("Expected URL is : " + url);
        }
    }

    @Then("^Print$")
    public void print() throws Throwable {
        String Page_Source = driver.getPageSource();
        int Page_Source_Lenght = driver.getPageSource().length();
        System.out.println(Page_Source);
        System.out.println("Total Lenght of Page source is " + Page_Source_Lenght);
        closeBrowser();

    }
}