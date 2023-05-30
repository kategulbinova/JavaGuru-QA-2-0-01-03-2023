package aleksejs_lukins.sauceDemo.tests;

import aleksejs_lukins.sauceDemo.pages.InventoryItemPage;
import aleksejs_lukins.sauceDemo.pages.InventoryPage;
import aleksejs_lukins.sauceDemo.pages.LoginPage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ProductListTest extends BaseTest {
    @Test
    public void successfulLogoutCheck() {
        // create all necessary page objects
        LoginPage loginPage = new LoginPage(driver);
        InventoryItemPage inventoryItemPage = new InventoryItemPage(driver);
        InventoryPage inventoryPage = new InventoryPage(driver);


        // run scenario
        loginPage.login("standard_user", "secret_sauce");

        // clicking on bike light
        inventoryPage.bikeLightClick();

        // clicking on back to products
        inventoryItemPage.backToProductsClick();

        // asserting that we can see other product in shop
        Assert.assertTrue(inventoryPage.isAllProductPageOpened());
    }
}
