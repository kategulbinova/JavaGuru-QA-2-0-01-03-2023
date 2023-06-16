package germans.sauceDemo.tests;

import germans.sauceDemo.pages.InventoryPage;
import germans.sauceDemo.pages.LoginPage;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;


public class LoginTest extends BaseTest{

    @Test
    @Parameters({"standard_user", "secret_sauce"})
    public void successfulLoginCheck(String standardUser, String secretSauce) {
        LoginPage loginPage = new LoginPage(driver);
        InventoryPage inventoryPage = new InventoryPage(driver);

        loginPage.login(standardUser,secretSauce);

        Assert.assertTrue( inventoryPage.isOpen() );
    }
}
