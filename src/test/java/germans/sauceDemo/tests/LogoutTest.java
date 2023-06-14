package germans.sauceDemo.tests;

import germans.sauceDemo.pages.InventoryPage;
import germans.sauceDemo.pages.LoginPage;
import germans.sauceDemo.pages.LogoutPage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LogoutTest extends BaseTest{
    @Test
    public void successfulLogoutCheck() {


        LoginPage loginPage = new LoginPage(driver);
        InventoryPage inventoryPage = new InventoryPage(driver);
        LogoutPage LogoutPage = new LogoutPage(driver);

        loginPage.login("standard_user", "secret_sauce");


        Assert.assertTrue(inventoryPage.isOpen());

        LogoutPage.logout();

        Assert.assertTrue(LogoutPage.isOpen());


    }
}
