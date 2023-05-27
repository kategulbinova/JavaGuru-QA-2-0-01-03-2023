package kristiana.sauceDemoNew.tests;

import kristiana.sauceDemoNew.pages.InventoryPage;
import kristiana.sauceDemoNew.pages.LoginPage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginTest extends BaseTest {
    @Test
    public void successfulLoginCheck() {
        //create all necessary page objects
        LoginPage loginPage = new LoginPage(driver);
        InventoryPage inventoryPage = new InventoryPage(driver);

        //run scenario
        loginPage.login("standard_user", "secret_sauce");

        // add assert
        Assert.assertTrue( inventoryPage.isOpen() );

    }
}
