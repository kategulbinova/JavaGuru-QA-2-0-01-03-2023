package olgaZikova.lesson12.sauceDemoNew.tests;

import olgaZikova.lesson12.sauceDemoNew.pages.InventoryPage;
import olgaZikova.lesson12.sauceDemoNew.pages.LoginPage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginTest extends BaseTest {

    @Test
    public void successfullLoginCheck () {
        //create all necessary page objects
        LoginPage loginPage = new LoginPage(driver);
        InventoryPage inventoryPage = new InventoryPage(driver);

        //run scenario
        loginPage.login("standard_user", "secret_sauce");

        Assert.assertTrue(inventoryPage.isOpenPage());

    }
}
