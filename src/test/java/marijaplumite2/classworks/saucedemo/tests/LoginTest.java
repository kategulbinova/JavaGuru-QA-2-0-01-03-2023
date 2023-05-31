package marijaplumite2.classworks.saucedemo.tests;

import marijaplumite2.classworks.saucedemo.pages.InventoryPage;
import marijaplumite2.classworks.saucedemo.pages.LoginPage;
import org.testng.Assert;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class LoginTest extends BaseTest{
    @Test
    @Parameters({"login", "password"})
    public void successfulLoginCheck(String login, String password){
        LoginPage loginPage = new LoginPage(driver);
        InventoryPage inventoryPage = new InventoryPage(driver, wait);

        loginPage.login(login, password);

        Assert.assertTrue( inventoryPage.isOpen() );
    }
}
