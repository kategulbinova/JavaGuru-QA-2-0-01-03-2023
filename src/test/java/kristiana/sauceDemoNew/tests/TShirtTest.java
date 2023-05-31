package kristiana.sauceDemoNew.tests;

import kristiana.sauceDemoNew.pages.ProductPage;
import kristiana.sauceDemoNew.pages.LoginPage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TShirtTest extends BaseTest{
    @Test
    public void productPageOpenCheck () {
        LoginPage loginPage = new LoginPage(driver);
        ProductPage productPage = new ProductPage(driver);

        loginPage.login("standard_user", "secret_sauce");
        productPage.checkLinkToTProductPage();
        Assert.assertTrue(productPage.isOpenProductPage());


    }
}
