package natuksa.saucedemo.tests;

import natuksa.saucedemo.pages.CartPage;
import natuksa.saucedemo.pages.CheckoutCompletePage;
import natuksa.saucedemo.pages.CheckoutStepOnePage;
import natuksa.saucedemo.pages.CheckoutStepTwoPage;
import org.testng.Assert;
import org.testng.annotations.Test;
import natuksa.saucedemo.pages.HomePage;
import natuksa.saucedemo.pages.InventoryPage;
import natuksa.saucedemo.pages.CartPage;
import natuksa.saucedemo.pages.CheckoutStepOnePage;
import natuksa.saucedemo.pages.CheckoutStepTwoPage;
import natuksa.saucedemo.pages.CheckoutCompletePage;

public class FillCheckoutDataFieldsTest extends BaseTest {
    @Test
    public void successfulFillCheckoutDataFields() {
        HomePage homePage = new HomePage(driver);
        InventoryPage inventoryPage = new InventoryPage(driver);
        CartPage cartPage = new CartPage(driver);
        CheckoutStepOnePage checkoutStepOnePage = new CheckoutStepOnePage(driver);
        CheckoutStepTwoPage checkoutStepTwoPage = new CheckoutStepTwoPage(driver);
        CheckoutCompletePage checkoutCompletePage = new CheckoutCompletePage(driver);

        homePage.login("standard_user", "secret_sauce");
        inventoryPage.addToCartBackpack();
        inventoryPage.goToCart();
        cartPage.goToCheckoutPage();
        checkoutStepOnePage.fillDataAndContinue("123", "sjdha", "123");
        checkoutStepTwoPage.finishOrder();
        Assert.assertTrue( checkoutCompletePage.isOrderComplete() );
    }
}
