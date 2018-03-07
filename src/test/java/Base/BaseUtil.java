package Base;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

public class BaseUtil {

    public WebDriver driver;
    public String url;

    public void openBrowser() {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\GQ\\Desktop\\Drivers\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
    }

    public void closeBrowser()
    {
        driver.close();
    }
    public void quitBrowser()
    {
        driver.quit();
    }

    public void openqapage(){
        url = "http://www.store.demoqa.com";
        driver.get(url);
    }

    public static void captureScreenshot(WebDriver driver,String screenshotName)
    {
        try
        {
            TakesScreenshot ts=(TakesScreenshot)driver;

            File source=ts.getScreenshotAs(OutputType.FILE);

            FileUtils.copyFile(source, new File("./Screenshots/"+screenshotName+".png"));

            System.out.println("Screenshot taken");
        }
        catch (Exception e)
        {
            System.out.println("Exception while taking screenshot "+e.getMessage());
        }
    }

}
