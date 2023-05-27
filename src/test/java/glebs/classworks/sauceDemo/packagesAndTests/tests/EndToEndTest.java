package glebs.classworks.sauceDemo.packagesAndTests.tests;

import glebs.classworks.sauceDemo.packagesAndTests.pages.*;
import org.testng.Assert;
import org.testng.annotations.Test;


public class EndToEndTest extends BaseTest{
    @Test
    public void endToEndTest(){
        LoginPage loginPage=new LoginPage(driver);
        InventoryPage inventoryPage=new InventoryPage(driver);
        YourCartPage yourCartPage=new YourCartPage(driver);
        CheckoutInfomationPage checkoutInfomationPage=new CheckoutInfomationPage(driver);
        CheckoutOverviewPage checkoutOverviewPage=new CheckoutOverviewPage(driver);
        CheckoutCompletePage checkoutCompletePage=new CheckoutCompletePage(driver);

        loginPage.login("standard_user","secret_sauce");
        inventoryPage.fleeceJacketAddToCartButton();
        inventoryPage.yourCartButton();

        Assert.assertTrue(yourCartPage.isActuallyOpen());

        yourCartPage.checkoutButton();
        checkoutInfomationPage.sendDetails("Arkadijs","Novoselovs","1772AP");
        checkoutOverviewPage.finishButton();

        Assert.assertTrue(checkoutCompletePage.isFinished());
    }

}
