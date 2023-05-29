package margo.classWork.sauceDemoTests.tests;

import margo.classWork.sauceDemoTests.pages.LoginPage;
import margo.classWork.sauceDemoTests.pages.ProductPage;
import org.testng.Assert;
import org.testng.annotations.Test;


public class BikeLightTest extends BaseTest{
    @Test
    public void bikeLightDescription() {
        //Create all necessary page objects
        LoginPage loginPage = new LoginPage(driver);
        ProductPage productPage = new ProductPage(driver);

        //Run scenario
        loginPage.login("standard_user", "secret_sauce");
        productPage.chooseBikeLight();

        //Add assert
        Assert.assertTrue(productPage.isPresent());
    }
}
