package irinaver.homework.sauceDemoNew.tests;

import irinaver.homework.sauceDemoNew.pages.CheckOutStepPage;
import irinaver.homework.sauceDemoNew.pages.InventoryPage;
import irinaver.homework.sauceDemoNew.pages.LoginPage;
import irinaver.homework.sauceDemoNew.pages.ViewCartPage;
import org.testng.Assert;
import org.testng.annotations.Test;

import static java.lang.Thread.sleep;

public class InventoryTest extends BaseTest {
    @Test
    public void addAndRemoveItems() throws InterruptedException {
        LoginPage loginPage = new LoginPage(driver);
        InventoryPage inventoryPage  = new InventoryPage(driver);
        ViewCartPage viewCartPage = new ViewCartPage(driver);
        CheckOutStepPage checkOutStepPage = new CheckOutStepPage(driver);

        //login;
        loginPage.login("standard_user", "secret_sauce");

        //assert;

        Assert.assertTrue(inventoryPage.isOpen());

        inventoryPage.sortItemsContainer();
        inventoryPage.sortingItems();

        Assert.assertTrue(inventoryPage.isSortedItemDisplayed());

        //adding and removing Backpack;
        inventoryPage.addBackPackToCart();
        inventoryPage.removeBackPackFromCart();
        sleep(1000);

        //assert
        Assert.assertTrue(inventoryPage.isSortedItemDisplayed());

         //adding Onesie to cart;
        inventoryPage.addOnesieToCart();
        inventoryPage.shoppingCartOpen();

        //open checkout step page;
        viewCartPage.checkOutButton();
        checkOutStepPage.cancelOption();

        Assert.assertTrue(viewCartPage.isContinueShoppingDisplayed());

        //returning to inventory page;
        viewCartPage.continueShopping();

        Assert.assertTrue(inventoryPage.isOpen());
        //logging out;
        loginPage.logout();

    }
}
