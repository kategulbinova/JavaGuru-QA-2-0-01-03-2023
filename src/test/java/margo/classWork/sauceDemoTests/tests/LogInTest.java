package margo.classWork.sauceDemoTests.tests;

import margo.classWork.sauceDemoTests.pages.InventoryPage;
import margo.classWork.sauceDemoTests.pages.LoginPage;
import org.testng.Assert;
import org.testng.annotations.Test;


public class LogInTest extends BaseTest{
    @Test
    public void successfulLoginCheck() {
        //Create all necessary page objects
        LoginPage loginPage = new LoginPage(driver);
        InventoryPage inventoryPage = new InventoryPage(driver);

        //Run scenario
        loginPage.login("standard_user", "secret_sauce");

        //Add asserts
        Assert.assertTrue(inventoryPage.isOpened());
    }
}
