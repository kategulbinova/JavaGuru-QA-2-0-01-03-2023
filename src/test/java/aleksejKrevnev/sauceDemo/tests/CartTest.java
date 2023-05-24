package aleksejKrevnev.sauceDemo.tests;

import aleksejKrevnev.sauceDemo.pages.CartPage;
import aleksejKrevnev.sauceDemo.pages.CheckoutPage;
import aleksejKrevnev.sauceDemo.pages.HomePage;
import aleksejKrevnev.sauceDemo.pages.InventoryPage;
import org.testng.Assert;
import org.testng.annotations.Test;
public class CartTest extends BaseTest{

    @Test
    public void addItemToCartAndCheckout() {
        HomePage homePage = new HomePage(driver);
        InventoryPage inventoryPage = new InventoryPage(driver);
        CartPage cartPage = new CartPage(driver);
        CheckoutPage checkoutPage = new CheckoutPage(driver);

        homePage.login("standard_user", "secret_sauce");
        inventoryPage.addItemToCart();
        Assert.assertTrue(inventoryPage.isAddedToCart());

        inventoryPage.goToCart();
        Assert.assertTrue(cartPage.isCheckoutButtonDisplayed());

        cartPage.checkout();
        checkoutPage.enterShippingInformation("John", "Doe", "12345");
        checkoutPage.continueToOverview();

    }
}
