package lpudnika.homework12.homework1SauceDemo.tests;

import lpudnika.homework12.homework1SauceDemo.pages.LoginPage;
import lpudnika.homework12.homework1SauceDemo.pages.YourCartPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class YourCartTest extends BaseTest {

    @Test
    public void successfulCartOpenCheck() {
        //Create object will all necessary pages
        LoginPage loginPage = new LoginPage(driver);
        YourCartPage yourCartPage = new YourCartPage(driver);

        //Login the page
        loginPage.login("standard_user", "secret_sauce");

        //Open cart
        yourCartPage.shoppingCart();

        //Check via Assert
        Assert.assertTrue(YourCartPage.isOpen());
    }
}
