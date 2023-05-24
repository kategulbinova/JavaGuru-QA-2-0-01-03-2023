package marijaplumite2.classworks.saucedemo.tests;

import marijaplumite2.classworks.saucedemo.pages.AboutPage;
import marijaplumite2.classworks.saucedemo.pages.LoginPage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class AboutLinkTest extends BaseTest{

    @Test
    public void aboutSideBarLinkCheck() {
        LoginPage loginPage = new LoginPage(driver);
        AboutPage aboutPage = new AboutPage(driver, wait);

        loginPage.login("standard_user", "secret_sauce");

        aboutPage.aboutLinkCheck();

        Assert.assertTrue( aboutPage.isOpen());

    }

}
