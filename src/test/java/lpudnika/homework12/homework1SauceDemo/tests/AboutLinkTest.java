package lpudnika.homework12.homework1SauceDemo.tests;

import lpudnika.homework12.homework1SauceDemo.pages.AboutPage;
import lpudnika.homework12.homework1SauceDemo.pages.InventoryPage;
import lpudnika.homework12.homework1SauceDemo.pages.LoginPage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class AboutLinkTest extends BaseTest {
    @Test
    public void aboutTestPageCheck() {
        //Creating objects of all necessary pages
        LoginPage loginPage = new LoginPage(driver);
        InventoryPage inventoryPage = new InventoryPage(driver, wait);
        AboutPage aboutPage = new AboutPage(driver);

        //Send login and password
        loginPage.login("standard_user", "secret_sauce");

        //Check via Assert
        Assert.assertTrue(inventoryPage.isOpen());

        //Open about
        inventoryPage.openMenu();
        inventoryPage.openAboutPage();

        //Check via Assert
        Assert.assertTrue(aboutPage.isOpen());
    }
}
