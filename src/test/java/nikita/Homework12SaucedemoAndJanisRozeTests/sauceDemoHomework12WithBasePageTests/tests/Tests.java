package nikita.Homework12SaucedemoAndJanisRozeTests.sauceDemoHomework12WithBasePageTests.tests;

import nikita.Homework12SaucedemoAndJanisRozeTests.sauceDemoHomework12WithBasePageTests.pages.CartPage;
import nikita.Homework12SaucedemoAndJanisRozeTests.sauceDemoHomework12WithBasePageTests.pages.CheckoutInfoPage;
import nikita.Homework12SaucedemoAndJanisRozeTests.sauceDemoHomework12WithBasePageTests.pages.InventoryPage;
import nikita.Homework12SaucedemoAndJanisRozeTests.sauceDemoHomework12WithBasePageTests.pages.LoginPage;
//import nikita.sauceDemoHomework12WithBasePageTests.pages.*;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Tests extends BaseTest {
    @Test
    public void successfulLoginCheck() {
        // create all necessary page objects
        //BasePage basePage = new BasePage (driver);
        LoginPage loginPage = new LoginPage(driver);
        InventoryPage inventoryPage = new InventoryPage(driver);

        // run scenario
        loginPage.login("standard_user", "secret_sauce");

        // Add asserts
        Assert.assertTrue( inventoryPage.isOpen() );
    }

    @Test
    public void continueShoppingBtnCheck() { //check that Continue Shopping button works and takes back to Inventory page
        //BasePage basePage = new BasePage (driver);
        LoginPage loginPage = new LoginPage(driver);
        InventoryPage inventoryPage = new InventoryPage(driver);
        CartPage cartPage = new CartPage(driver);

        loginPage.login("standard_user", "secret_sauce");

        inventoryPage.cartPageOpen();

        cartPage.continueShopping();

        Assert.assertTrue(inventoryPage.isOpenByURL());


    }
    @Test
    public void proceedToCheckoutPageCheck() { // Check that Proceed to Checkout button works and takes to Checkout Information page
        //BasePage basePage = new BasePage (driver);
        LoginPage loginPage = new LoginPage(driver);
        InventoryPage inventoryPage = new InventoryPage(driver);
        CartPage cartPage = new CartPage(driver);
        CheckoutInfoPage checkoutInfoPage = new CheckoutInfoPage(driver);

        loginPage.login("standard_user", "secret_sauce");

        inventoryPage.cartPageOpen();

        cartPage.checkoutPageMove();

        Assert.assertTrue(checkoutInfoPage.isOpenByURL());


    }

    @Test
    public void totalPriceIsTheSameInTheCartCheck() { // check that the sum of all item prices from inventory page equals to the sum of prices for these added items in the cart page.
        //BasePage basePage = new BasePage (driver);
        LoginPage loginPage = new LoginPage(driver);
        InventoryPage inventoryPage = new InventoryPage(driver);
        CartPage cartPage = new CartPage(driver);

        loginPage.login("standard_user", "secret_sauce");

        inventoryPage.addAllItemsToCart();

        double invenotoryPageTotalSumOfListedItems = inventoryPage.totalSumOfListedItems();

        inventoryPage.cartPageOpen();

        Assert.assertEquals(invenotoryPageTotalSumOfListedItems, cartPage.totalSumOfListedItems());


    }

    @Test
    public void checkoutPageStillOpenWhenFormFieldsEmptyCheck() { // check that when no data is provided for Checkout Form fields, clicking continue button does not take to the next page
        //BasePage basePage = new BasePage (driver);
        LoginPage loginPage = new LoginPage(driver);
        InventoryPage inventoryPage = new InventoryPage(driver);
        CartPage cartPage = new CartPage(driver);
        CheckoutInfoPage checkoutInfoPage = new CheckoutInfoPage(driver);

        loginPage.login("standard_user", "secret_sauce");

        inventoryPage.cartPageOpen();

        cartPage.checkoutPageMove();

        checkoutInfoPage.ContinueBtnClick();

        Assert.assertTrue(checkoutInfoPage.isOpenByURL());
    }

    @Test
    public void logoutFromCheckoutInfoPageCheck() { // check that logout button works when clicked from Checkout Info page
        //BasePage basePage = new BasePage (driver);
        LoginPage loginPage = new LoginPage(driver);
        InventoryPage inventoryPage = new InventoryPage(driver);
        CartPage cartPage = new CartPage(driver);
        CheckoutInfoPage checkoutInfoPage = new CheckoutInfoPage(driver);

        loginPage.login("standard_user", "secret_sauce");

        inventoryPage.cartPageOpen();

        cartPage.checkoutPageMove();

        checkoutInfoPage.logoutFromThisPage();

        Assert.assertTrue(loginPage.isOpen());
    }

    @Test
    public void logoutFromCartPageCheck() { // check that logout button works when clicked from the Cart Page
        //BasePage basePage = new BasePage (driver);
        LoginPage loginPage = new LoginPage(driver);
        InventoryPage inventoryPage = new InventoryPage(driver);
        CartPage cartPage = new CartPage(driver);
        CheckoutInfoPage checkoutInfoPage = new CheckoutInfoPage(driver);

        loginPage.login("standard_user", "secret_sauce");

        inventoryPage.cartPageOpen();

        cartPage.logoutFromThisPage();

        Assert.assertTrue(loginPage.isOpen());
    }


}
