package glebs.classworks.sauceDemo.packagesAndTests.tests;

import glebs.classworks.sauceDemo.packagesAndTests.pages.InventoryPage;
import glebs.classworks.sauceDemo.packagesAndTests.pages.LoginPage;
import glebs.classworks.sauceDemo.packagesAndTests.pages.ProductPage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TshirtAddToCartTest extends BaseTest{
    @Test
    public void ProductAddToCart(){
        LoginPage loginPage=new LoginPage(driver);
        InventoryPage inventoryPage=new InventoryPage(driver);
        ProductPage productPage =new ProductPage(driver);

        loginPage.login("standard_user","secret_sauce");

        inventoryPage.shirtClickCheck();

        productPage.addToCartTshirt();

        Assert.assertTrue(productPage.isPressed());
    }
}
