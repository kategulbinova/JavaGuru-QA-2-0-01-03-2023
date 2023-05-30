package olgaZikova.homework12.sauceDemoTestHwrk.tests;

import olgaZikova.homework12.sauceDemoTestHwrk.pages.LoginPage;
import olgaZikova.homework12.sauceDemoTestHwrk.pages.AboutPage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class AboutLinkTest extends BaseTest {

    @Test
    public void successfullLogout (){
        LoginPage loginPage = new LoginPage(driver);
        AboutPage aboutPage = new AboutPage(driver,wait);

        loginPage.login("standard_user", "secret_sauce");
        aboutPage.makeLogout();

        Assert.assertTrue(aboutPage.isLogout());
    }
}
