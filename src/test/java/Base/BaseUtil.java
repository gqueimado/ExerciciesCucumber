package Base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseUtil {

    public WebDriver driver;
    public String url;

    public void openBrowser()
    {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\GQ\\Desktop\\Drivers\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
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


}
