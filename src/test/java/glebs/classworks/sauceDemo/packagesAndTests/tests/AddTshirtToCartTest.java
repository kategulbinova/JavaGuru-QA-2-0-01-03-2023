package glebs.classworks.sauceDemo.packagesAndTests.tests;

import glebs.classworks.sauceDemo.packagesAndTests.pages.InventoryPage;
import glebs.classworks.sauceDemo.packagesAndTests.pages.LoginPage;
import glebs.classworks.sauceDemo.packagesAndTests.pages.ProductPage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class AddTshirtToCartTest extends BaseTest{
    @Test
    public void AddProductToCart(){
        LoginPage loginPage=new LoginPage(driver);
        InventoryPage inventoryPage=new InventoryPage(driver);
        ProductPage productPage =new ProductPage(driver);

        loginPage.login("standard_user","secret_sauce");

        inventoryPage.clickTShirtCheck();

        productPage.addTshirtToCart();

        Assert.assertTrue(productPage.isPressed());
    }
}
