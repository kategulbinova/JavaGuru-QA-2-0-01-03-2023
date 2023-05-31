package irinaver.homework.sauceDemoNew.tests;

import irinaver.homework.sauceDemoNew.pages.CheckOutStepPage;
import irinaver.homework.sauceDemoNew.pages.InventoryPage;
import irinaver.homework.sauceDemoNew.pages.LoginPage;
import irinaver.homework.sauceDemoNew.pages.ViewCartPage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginTest extends BaseTest{
    @Test
    public void successfulLoginCheck() throws InterruptedException {
        //create objects
        LoginPage loginPage = new LoginPage();
        InventoryPage inventoryPage  = new InventoryPage();
        ViewCartPage viewCartPage = new ViewCartPage();
        CheckOutStepPage checkOutStepPage = new CheckOutStepPage();

        //run scenario
       loginPage.login("standard_user", "secret_sauce");
        //add asserts

       Assert.assertTrue(inventoryPage.isOpen());

       inventoryPage.sortItemsContainer();
       Assert.assertTrue(inventoryPage.isSortedItemDisplayed());
       inventoryPage.sortingItems();

       inventoryPage.addBackPackToCart();
       inventoryPage.removeBackPackFromCart();

       inventoryPage.addJacketToCart();
       inventoryPage.addOnesieToCart();

       viewCartPage.shoppingCartDropDown();

       viewCartPage.checkOutButton();

       checkOutStepPage.checkOutInfo("Ann","Greengable","UK456");

        checkOutStepPage.continuePurchase();

        Assert.assertTrue(checkOutStepPage.isFinishButtonAvailable());
        checkOutStepPage.finishPurchase();

        Assert.assertTrue(checkOutStepPage.isBackHomeButtonDisplayed());
        checkOutStepPage.backHome();
        Assert.assertTrue(checkOutStepPage.isInventoryPageOpen());

        loginPage.logout();

    }

}
