package margo.classWork.sauceDemoTests.tests;

import margo.classWork.sauceDemoTests.pages.CartPage;
import margo.classWork.sauceDemoTests.pages.CheckoutYrInfoPage;
import margo.classWork.sauceDemoTests.pages.InventoryPage;
import margo.classWork.sauceDemoTests.pages.LoginPage;
import margo.classWork.sauceDemoTests.pages.ProductPage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class CheckoutErrorAndCancelTest extends BaseTest{
    @Test
    public void proceedToCheckoutAndCancel() {
        //Create all necessary page objects
        LoginPage loginPage = new LoginPage(driver);
        InventoryPage inventoryPage = new InventoryPage(driver);
        ProductPage productPage = new ProductPage(driver);
        CartPage cartPage = new CartPage(driver);
        CheckoutYrInfoPage checkoutYrInfoPage = new CheckoutYrInfoPage(driver);

        //Run scenario
        loginPage.login("standard_user", "secret_sauce");
        inventoryPage.clickOnBikeLightProduct();
        productPage.addToCart();
        productPage.goToCart();
        cartPage.checkoutBtnClick();
        checkoutYrInfoPage.checkoutProcess();
        checkoutYrInfoPage.getErrorTextAndCancel();

        //Add asserts
        Assert.assertTrue(cartPage.isYourCartPresent());
    }
}
