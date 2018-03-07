package Steps;

import Base.BaseUtil;
import cucumber.api.java.Before;
import org.testng.annotations.AfterMethod;


public class Hook extends BaseUtil {
    public Hook(BaseUtil base) {
        this.base = base;
    }

    private BaseUtil base;

    @Before
    public void InitializeTest()
    {
        System.out.println("\bOpening the browser\b");
    }

    // It will execute after every test execution
    @AfterMethod
    public void tearDown()
    {
        driver.quit();
    }


    /*public void Teste(){
        WebElement Marcas = driver.findElement(By.id(""));
        Select Marca = new Select(Marcas);
        Marca.selectByIndex(2);
    }*/

}


