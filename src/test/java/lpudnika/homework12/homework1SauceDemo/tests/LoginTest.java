package lpudnika.homework12.homework1SauceDemo.tests;

import lpudnika.homework12.homework1SauceDemo.pages.InventoryPage;
import lpudnika.homework12.homework1SauceDemo.pages.LoginPage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginTest extends BaseTest {
    @Test
    public void successfulLoginCheck(){
        //Creating objects of all necessary pages
        LoginPage loginPage = new LoginPage(driver);
        InventoryPage inventoryPage = new InventoryPage(driver);

        //Send login and password
        loginPage.login("standard_user", "secret_sauce");

        //Check via Assert
        Assert.assertTrue(inventoryPage.isOpen());

    }
}
