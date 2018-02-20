package Steps;

import Base.BaseUtil;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

import java.util.concurrent.TimeUnit;

import static com.oracle.jrockit.jfr.Transition.From;

public class Exercise6Steps extends BaseUtil {
    @Given("^i am at dhtmlx page$")
    public void iAmAtDhtmlxPage() throws Throwable {
        openBrowser();
        driver.get("https://dhtmlx.com/docs/products/dhtmlxTree/");

    }

    @And("^perform a drag and drop$")
    public void performADragAndDrop() throws Throwable {

        driver.manage().timeouts().implicitlyWait(10000, TimeUnit.MILLISECONDS);
        WebElement from = driver.findElement(By.xpath("(//span[@class='standartTreeRow' and text()='Thrillers'])[1]")) ;
        WebElement to = driver.findElement(By.xpath("(//span[@class='standartTreeRow' and text()='Thrillers'])[2]")) ;
        Actions builder = new Actions(driver);
        Action dragAndDrop = builder.clickAndHold(from).moveToElement(to).release(to).build();
        dragAndDrop.perform();
        closeBrowser();
    }
}
