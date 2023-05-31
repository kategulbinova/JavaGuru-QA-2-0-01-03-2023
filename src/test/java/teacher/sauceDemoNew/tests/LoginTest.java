package teacher.sauceDemoNew.tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import teacher.sauceDemoNew.pages.InventoryPage;
import teacher.sauceDemoNew.pages.LoginPage;

public class LoginTest extends BaseTest{
    @Test
    public void successfulLoginCheck() {
        // create all necessary page objects
        LoginPage loginPage = new LoginPage();
        InventoryPage inventoryPage = new InventoryPage();

        // run scenario
        loginPage.login("standard_user", "secret_sauce");

        // Add asserts
        Assert.assertTrue( inventoryPage.isOpen() );
    }
}
