package aleksejs_lukins.sauceDemo.tests;

import aleksejs_lukins.sauceDemo.pages.BikeLightPage;
import aleksejs_lukins.sauceDemo.pages.InventoryPage;
import aleksejs_lukins.sauceDemo.pages.LoginPage;
import aleksejs_lukins.sauceDemo.pages.LogoutPage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class BikeLightTest extends BaseTest {
    @Test
    public void successfulLogoutCheck() {
        // create all necessary page objects
        LoginPage loginPage = new LoginPage(driver);
        BikeLightPage bikeLightPage = new BikeLightPage(driver);

        // run scenario
        loginPage.login("standard_user", "secret_sauce");



        // clicking on bike light
        bikeLightPage.bikeLightClick();

        // clicking on back to products
        bikeLightPage.backToProductsClick();

        // asserting that we can see other product in shop
        Assert.assertTrue(bikeLightPage.isOpen());
    }
}
