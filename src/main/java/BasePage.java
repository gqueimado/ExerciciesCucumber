

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BasePage {
    public static WebDriver driver;

    @BeforeClass
    public static void before() {

        System.setProperty("webdriver.chrome.driver","C:\\Users\\GQ\\Desktop\\Drivers\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
    }

    @AfterClass
    public static void after() { driver.close(); }

}
