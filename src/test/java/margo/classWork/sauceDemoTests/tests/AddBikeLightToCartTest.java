package margo.classWork.sauceDemoTests.tests;

import margo.classWork.sauceDemoTests.pages.InventoryPage;
import margo.classWork.sauceDemoTests.pages.LoginPage;
import margo.classWork.sauceDemoTests.pages.ProductPage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class AddBikeLightToCartTest extends BaseTest{
    @Test
    public void addBikeLightToCart() {
        //Create all necessary page objects
        LoginPage loginPage = new LoginPage(driver);
        InventoryPage inventoryPage = new InventoryPage(driver);
        ProductPage productPage = new ProductPage(driver);

        //Run scenario
        loginPage.login("standard_user", "secret_sauce");
        inventoryPage.clickOnBikeLightProduct();
        productPage.addToCart();

        //Add assert
        Assert.assertTrue(productPage.isRmvBtnPresent());
    }
}
