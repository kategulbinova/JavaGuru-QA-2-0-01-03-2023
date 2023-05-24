package aleksejKrevnev.sauceDemo.tests;

import aleksejKrevnev.sauceDemo.pages.HomePage;
import aleksejKrevnev.sauceDemo.pages.InventoryPage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LogoutTest extends BaseTest {
    @Test
    public void successfulLogoutCheck() {
        HomePage homePage = new HomePage(driver);
        InventoryPage inventoryPage = new InventoryPage(driver);

        homePage.login("standard_user", "secret_sauce");
        Assert.assertTrue(inventoryPage.isOpen());

        inventoryPage.logout();
        Assert.assertTrue(homePage.isDisplayed());
    }
}
