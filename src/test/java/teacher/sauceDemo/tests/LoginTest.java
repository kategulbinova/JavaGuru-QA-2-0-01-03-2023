package teacher.sauceDemo.tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import teacher.sauceDemo.pages.HomePage;
import teacher.sauceDemo.pages.InventoryPage;

public class LoginTest extends BaseTest {
    @Test
    public void successfulLoginCheck() {
        HomePage homePage = new HomePage(driver);
        InventoryPage inventoryPage = new InventoryPage(driver);

        homePage.login("standard_user", "secret_sauce");
        Assert.assertTrue( inventoryPage.isOpen() );
    }
}
