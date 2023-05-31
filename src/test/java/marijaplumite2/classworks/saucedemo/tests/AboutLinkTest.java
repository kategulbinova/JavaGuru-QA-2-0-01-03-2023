package marijaplumite2.classworks.saucedemo.tests;

import marijaplumite2.classworks.saucedemo.pages.AboutPage;
import marijaplumite2.classworks.saucedemo.pages.InventoryPage;
import marijaplumite2.classworks.saucedemo.pages.LoginPage;
import org.testng.Assert;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class AboutLinkTest extends BaseTest{

    @Test
    @Parameters({"login", "password"})
    public void aboutSideBarLinkCheck(String login, String password) {
        LoginPage loginPage = new LoginPage(driver);
        InventoryPage inventoryPage = new InventoryPage(driver, wait);
        AboutPage aboutPage = new AboutPage(driver);

        loginPage.login(login, password);

        inventoryPage.openMenu();
        inventoryPage.goToAboutPage();

        Assert.assertTrue( aboutPage.isOpen());

    }

}
