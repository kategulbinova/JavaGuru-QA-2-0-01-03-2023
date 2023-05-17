package marijaplumite2.classworks.saucedemo.tests;

import marijaplumite2.classworks.saucedemo.pages.InventoryPage;
import marijaplumite2.classworks.saucedemo.pages.LoginPage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginTest extends BaseTest{
    @Test
    public void successfulLoginCheck(){
        LoginPage loginPage = new LoginPage(driver);
        InventoryPage inventoryPage = new InventoryPage(driver);

        loginPage.login("standard_user", "secret_sauce");

        Assert.assertTrue( inventoryPage.isOpen() );
    }
}
