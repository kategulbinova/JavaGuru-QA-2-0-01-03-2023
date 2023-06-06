package margo.classWork.sauceDemoTests.tests;

import margo.classWork.sauceDemoTests.pages.CartPage;
import margo.classWork.sauceDemoTests.pages.CheckoutYrInfoPage;
import margo.classWork.sauceDemoTests.pages.LoginPage;
import margo.classWork.sauceDemoTests.pages.ProductPage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class CheckoutCancelTest extends BaseTest{
    @Test
    public void proceedToCheckoutAndCancel() {
        //Create all necessary page objects
        LoginPage loginPage = new LoginPage(driver);
        ProductPage productPage = new ProductPage(driver);
        CartPage cartPage = new CartPage(driver);
        CheckoutYrInfoPage checkoutYrInfoPage = new CheckoutYrInfoPage(driver);

        //Run scenario
        loginPage.login("standard_user", "secret_sauce");
        productPage.chooseBikeLight();
        productPage.addingToCart();
        cartPage.goToCart();
        checkoutYrInfoPage.checkoutBtnPress();
        checkoutYrInfoPage.checkoutProcess();
        checkoutYrInfoPage.getErrorTextAndCancel();

        //Add asserts
        Assert.assertTrue(cartPage.isYourCartPresent());
    }
}
