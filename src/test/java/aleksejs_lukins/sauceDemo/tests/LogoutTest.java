package aleksejs_lukins.sauceDemo.tests;

import aleksejs_lukins.sauceDemo.pages.InventoryPage;
import aleksejs_lukins.sauceDemo.pages.LoginPage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LogoutTest extends BaseTest{
    @Test
    public void successfulLogoutCheck() {
        // create all necessary page objects
        LoginPage loginPage = new LoginPage(driver);
        InventoryPage inventoryPage = new InventoryPage(driver);

        // run scenario
        loginPage.login("standard_user", "secret_sauce");

        // asserting that inventory page is opened
        Assert.assertTrue(inventoryPage.isOpen());

        // logging out
        inventoryPage.logout();

        // asserting that we can see login button on index page after logout
        Assert.assertTrue(loginPage.isOpen());


    }
}
