package margo.classWork.sauceDemoTests.tests;

import margo.classWork.sauceDemoTests.pages.CartPage;
import margo.classWork.sauceDemoTests.pages.LoginPage;
import margo.classWork.sauceDemoTests.pages.ProductPage;
import org.testng.Assert;
import org.testng.annotations.Test;
public class CartCheckTest extends BaseTest {
    @Test
    public void checkCart() {
        //Create all necessary page objects
        LoginPage loginPage = new LoginPage(driver);
        ProductPage productPage = new ProductPage(driver);
        CartPage cartPage = new CartPage(driver);

        //Run scenario
        loginPage.login("standard_user", "secret_sauce");
        productPage.chooseBikeLight();
        productPage.addingToCart();
        cartPage.goToCart();

        //Add asserts
        Assert.assertTrue(cartPage.isCheckoutBtnPresent());
    }
}
