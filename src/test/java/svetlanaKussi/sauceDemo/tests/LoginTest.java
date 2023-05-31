package svetlanaKussi.sauceDemo.tests;


import org.testng.annotations.Test;
import svetlanaKussi.sauceDemo.pages.LoginPage;


public class LoginTest extends BaseTest {
    @Test
    public void successfulLoginCheck() {
       LoginPage loginPage = new LoginPage(driver);

        loginPage.login("standard_user", "secret_sauce");
    }
}
