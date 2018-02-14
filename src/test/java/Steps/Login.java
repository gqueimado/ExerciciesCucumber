package Steps;

import Base.BaseUtil;
import cucumber.api.DataTable;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;

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
    }

    @And("^I click on login button$")
    public void iClickOnLoginButton() throws Throwable {

    }

    @And("^I enter the following for login$")
    public void iEnterTheFollowingForLogin(DataTable table) throws Throwable {
        List<List<String>> data = table.raw();
        /*System.out.println("The value is : " + data.get(0).get(0));
        System.out.println("The value is : " + data.get(0).get(1));*/

        //Create an ArrayList
        List<User> users = new ArrayList<User>();
        //Store all the users
        users = table.asList(User.class);

        for (User user: users) {
            System.out.println("The username is : " + user.username);
            System.out.println("The password is : " + user.password);
        }
    }

    @And("^I enter ([^\"]*) and ([^\"]*)$")
    public void iEnterUsernameAndPassword(String userName,String passWord) throws Throwable {
        //System.out.println(("Username is : " + userName));
        //System.out.println(("Username is : " + passWord));
        closeBrowser();


    }


    public class User {
        public String username;
        public String password;

        public User(String userName, String passWord) {
            username = userName;
            password = passWord;
        }
    }
}