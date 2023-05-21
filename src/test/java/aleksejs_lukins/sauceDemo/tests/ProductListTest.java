package aleksejs_lukins.sauceDemo.tests;

import aleksejs_lukins.sauceDemo.pages.ProductListPage;
import aleksejs_lukins.sauceDemo.pages.LoginPage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ProductListTest extends BaseTest {
    @Test
    public void successfulLogoutCheck() {
        // create all necessary page objects
        LoginPage loginPage = new LoginPage(driver);
        ProductListPage productListPage = new ProductListPage(driver);

        // run scenario
        loginPage.login("standard_user", "secret_sauce");



        // clicking on bike light
        productListPage.bikeLightClick();

        // clicking on back to products
        productListPage.backToProductsClick();

        // asserting that we can see other product in shop
        Assert.assertTrue(productListPage.isAllProductPageOpened());
    }
}
