package germans.sauceDemo.tests;

import germans.sauceDemo.pages.InventoryPage;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;


public class LoginTest extends BaseTest{
    public LoginTest(WebDriver driver) {

    }
    @Test
    @Parameters({"standard_user", "secret_sauce"})
    public void successfulLoginCheck(String standard_user, String secret_sauce) {
        LoginTest loginPage = new LoginTest(driver);
        InventoryPage inventoryPage = new InventoryPage(driver);

        loginPage.successfulLoginCheck("standard_user", "secret_sauce");

        Assert.assertTrue( inventoryPage.isOpen() );
    }
}
