package marijaplumite2.classworks.saucedemo.tests;

import marijaplumite2.classworks.saucedemo.pages.InventoryPage;
import marijaplumite2.classworks.saucedemo.pages.LoginPage;
import marijaplumite2.classworks.saucedemo.pages.ViewProductPage;
import org.testng.Assert;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;


public class ViewProductTest extends BaseTest{

    @Test
    @Parameters({"login", "password"})
    public void checkProductInfo(String login, String password){
        LoginPage loginPage = new LoginPage(driver);
        InventoryPage inventoryPage =new InventoryPage(driver, wait);
        ViewProductPage viewProductPage = new ViewProductPage(driver);

        loginPage.login(login, password);

        inventoryPage.goToViewBackPack();

        Assert.assertTrue( viewProductPage.isOpen() );
    }
}
