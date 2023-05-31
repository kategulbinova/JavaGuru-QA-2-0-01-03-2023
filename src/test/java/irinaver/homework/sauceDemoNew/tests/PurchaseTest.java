package irinaver.homework.sauceDemoNew.tests;

import irinaver.homework.sauceDemoNew.pages.CheckOutStepPage;
import irinaver.homework.sauceDemoNew.pages.InventoryPage;
import irinaver.homework.sauceDemoNew.pages.LoginPage;
import irinaver.homework.sauceDemoNew.pages.ViewCartPage;
import org.testng.Assert;
import org.testng.annotations.Test;

import static java.lang.Thread.sleep;

public class PurchaseTest extends BaseTest {
    @Test
    public void successfulPurchaseImitation() throws InterruptedException {
        LoginPage loginPage = new LoginPage();
        InventoryPage inventoryPage  = new InventoryPage();
        ViewCartPage viewCartPage = new ViewCartPage();
        CheckOutStepPage checkOutStepPage = new CheckOutStepPage();
        //login

        loginPage.login("standard_user", "secret_sauce");
        inventoryPage.isOpen();

        //adding and removing goods;
        inventoryPage.addBackPackToCart();
        inventoryPage.removeBackPackFromCart();

        //adding another goods;
        inventoryPage.addJacketToCart();
        inventoryPage.addOnesieToCart();sleep(1000);

        // moving to the next page;
        viewCartPage.shoppingCartDropDown();

        viewCartPage.checkOutButton();

        //sending key checkout: your information;
        checkOutStepPage.checkOutInfo("Ann","Greengable","UK456");

        //clicking continue;
        checkOutStepPage.continuePurchase();

        Assert.assertTrue(checkOutStepPage.isFinishButtonAvailable());

        //clicking finish;
        checkOutStepPage.finishPurchase();
        Assert.assertTrue(checkOutStepPage.isBackHomeButtonDisplayed());

        checkOutStepPage.backHome();

        Assert.assertTrue(checkOutStepPage.isInventoryPageOpen());

        loginPage.logout();



    }
}
