package olgaZikova.homework12.sauceDemoTestHwrk.tests;

import olgaZikova.homework12.sauceDemoTestHwrk.pages.LoginPage;
import olgaZikova.homework12.sauceDemoTestHwrk.pages.LogoutPage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LogoutLinkTest extends BaseTest {

    @Test
    public void successfullLogout (){
        LoginPage loginPage = new LoginPage(driver);
        LogoutPage logoutPage = new LogoutPage(driver,wait);

        loginPage.login("standard_user", "secret_sauce");
        logoutPage.makeLogout();

        Assert.assertTrue(logoutPage.isLogout());
    }
}
