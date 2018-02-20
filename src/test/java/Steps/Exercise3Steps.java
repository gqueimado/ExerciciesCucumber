package Steps;

import Base.BaseUtil;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import org.openqa.selenium.By;

public class Exercise3Steps extends BaseUtil {

    @Given("^I am at demoqa page and do some actions$")
    public void iAmAtDemoqaPageAndDoSomeActions() throws Throwable {
        openBrowser();
        openqapage();
        driver.findElement(By.xpath("//*[@id='logo']")).click();
        driver.navigate().back();
        driver.navigate().forward();
        driver.navigate().to(url);
    }

    @And("^perform a refresh in the page$")
    public void performARefreshInThePage() throws Throwable {
        driver.navigate().refresh();
        closeBrowser();
    }
}
