package lpudnika.homework12.homework1SauceDemo.tests;

import lpudnika.homework12.homework1SauceDemo.pages.InventoryPage;
import lpudnika.homework12.homework1SauceDemo.pages.LoginPage;
import lpudnika.homework12.homework1SauceDemo.pages.ViewProductPage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ViewProductTest extends BaseTest{
    @Test
    public void successfulProductOpenCheck(){
        //Creating objects of all necessary pages
        LoginPage loginPage = new LoginPage(driver);
        InventoryPage inventoryPage = new InventoryPage(driver, wait);
        ViewProductPage openSauceLabsBackpackProductPage = new ViewProductPage(driver);

        //Send login and password
        loginPage.login("standard_user", "secret_sauce");

        //Check via Assert
        Assert.assertTrue(inventoryPage.isOpen());

        //Open Sauce Labs Backpack
        openSauceLabsBackpackProductPage.openProduct();

        //Check via Assert
        Assert.assertTrue(openSauceLabsBackpackProductPage.isOpen());
    }
}
