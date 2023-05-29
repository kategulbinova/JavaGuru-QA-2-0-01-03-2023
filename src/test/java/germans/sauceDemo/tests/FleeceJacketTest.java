package germans.sauceDemo.tests;

import germans.sauceDemo.pages.LoginPage;
import germans.sauceDemo.pages.ViewProductPage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class FleeceJacketTest extends BaseTest{
    @Test
    public void productPageOpenCheck () {
        LoginPage loginPage = new LoginPage(driver);
        ViewProductPage productPage = new ViewProductPage(driver);

        loginPage.login("standard_user", "secret_sauce");
        productPage.isAllProductPageOpened();
        Assert.assertTrue(productPage.isAllProductPageOpened());


    }
}
