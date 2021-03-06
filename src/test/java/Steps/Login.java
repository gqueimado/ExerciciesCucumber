package Steps;

import Base.BaseUtil;
import cucumber.api.DataTable;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import org.openqa.selenium.By;

import java.util.ArrayList;
import java.util.List;

public class Login extends BaseUtil {

    private BaseUtil base;

    public Login(BaseUtil base) {
        this.base = base;
    }

    @Given("^I navigate to the login page$")
    public void iNavigateToTheLoginPage() throws Throwable {
        openBrowser();
        String url = "http://www.executeautomation.com/demosite/Login.html";
        driver.get(url);
    }


    @And("^I enter the following for login$")
    public void iEnterTheFollowingForLogin(DataTable table) throws Throwable {
        List<List<String>> data = table.raw();
        /*System.out.println("The value is : " + data.get(0).get(0));
        System.out.println("The value is : " + data.get(0).get(1));*/
        //Create an ArrayList
         List<User> users = new ArrayList<>();
        //Store all the users
        users = table.asList(User.class);
        for (User user: users) {
        //System.out.println("The username is : " + user.username);
        //System.out.println("The password is : " + user.password);
        driver.findElement(By.name("UserName")).sendKeys("admin");
        driver.findElement(By.name("Password")).sendKeys("adminpassw");

    }
    }

    @And("^I enter ([^\"]*) and ([^\"]*)$")
    public void iEnterUsernameAndPassword(String userName, String passWord) throws Throwable {
        //System.out.println(("Username is : " + userName));
        //System.out.println(("Username is : " + passWord));
    }

    @And("^click on loggin button$")
    public void clickOnLogginButton() throws Throwable {
       driver.findElement(By.xpath("//input[@name='Login']")).click();
        }

    @Then("^i am redirect to logged page$")
    public void iAmRedirectToLoggedPage() throws Throwable {
        System.out.println(driver.getCurrentUrl());
        Thread.sleep(1000);
        driver.findElement(By.xpath("//h2[contains(text(),'User Form')]")).isDisplayed();
        closeBrowser();
    }

    class User {
        public String username;
        public String password;

        public User(String userName, String passWord) {
            username = userName;
            password = passWord;
        }
    }
}