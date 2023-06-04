package yanaItani.sauseDemo.tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import yanaItani.sauseDemo.pages.BurgerMenuPage;
import yanaItani.sauseDemo.pages.LogInPage;

public class burgerMenuTest extends BaseTest{

    @Test
    public void successfulLogoutTest() {
        LogInPage loginpage = new LogInPage(driver);
        BurgerMenuPage burgermenupage = new BurgerMenuPage(driver);

        loginpage.login("standard_user","secret_sauce");

        burgermenupage.logOut();

        Assert.assertTrue(loginpage.loginIsOpen());
        if (loginpage.loginIsOpen()) {

            System.out.println("logout successful");

        } else {

            System.out.println("nah, still logged in");

        }
    }
}
