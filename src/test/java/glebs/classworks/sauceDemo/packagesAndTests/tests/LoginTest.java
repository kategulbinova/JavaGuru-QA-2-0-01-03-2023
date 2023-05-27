package glebs.classworks.sauceDemo.packagesAndTests.tests;

import glebs.classworks.sauceDemo.packagesAndTests.pages.InventoryPage;
import glebs.classworks.sauceDemo.packagesAndTests.pages.LoginPage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginTest extends BaseTest {
    @Test
    public void loginCheck(){

        LoginPage loginPage=new LoginPage(driver);
        InventoryPage inventoryPage=new InventoryPage(driver);

        loginPage.login("standard_user","secret_sauce");

        Assert.assertTrue(inventoryPage.isOpen());
    }
}
