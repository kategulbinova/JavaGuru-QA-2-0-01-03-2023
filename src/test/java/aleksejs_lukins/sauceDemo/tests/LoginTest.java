package aleksejs_lukins.sauceDemo.tests;

import aleksejs_lukins.sauceDemo.pages.InventoryPage;
import aleksejs_lukins.sauceDemo.pages.LoginPage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginTest extends BaseTest{
    @Test
    public void successfulLoginCheck() {
        // create all necessary page objects
        LoginPage loginPage = new LoginPage(driver);
        InventoryPage inventoryPage = new InventoryPage(driver);

        // run scenario
        loginPage.login("standard_user", "secret_sauce");

        // Add asserts
        Assert.assertTrue( inventoryPage.isOpen() );
    }
}
