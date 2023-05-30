package aleksejs_lukins.sauceDemo.tests;

import aleksejs_lukins.sauceDemo.pages.CartPage;
import aleksejs_lukins.sauceDemo.pages.InventoryPage;
import aleksejs_lukins.sauceDemo.pages.LoginPage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class CartTest extends BaseTest{
    @Test
    public void checkoutButtonCheck() {
        // create all necessary page objects
        LoginPage loginPage = new LoginPage(driver);
        InventoryPage inventoryPage = new InventoryPage(driver);
        CartPage cartPage = new CartPage(driver);

        // run scenario
        loginPage.login("standard_user", "secret_sauce");

        inventoryPage.clickCartButton();

        // asserting that cart page is opened(checkout button is displayed)
        Assert.assertTrue(cartPage.isCartPageOpened());


    }
}
