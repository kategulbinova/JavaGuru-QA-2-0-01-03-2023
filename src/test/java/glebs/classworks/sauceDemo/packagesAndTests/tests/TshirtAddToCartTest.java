package glebs.classworks.sauceDemo.packagesAndTests.tests;

import glebs.classworks.sauceDemo.packagesAndTests.pages.InventoryPage;
import glebs.classworks.sauceDemo.packagesAndTests.pages.LoginPage;
import glebs.classworks.sauceDemo.packagesAndTests.pages.TshirtPage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TshirtAddToCartTest extends BaseTest{
    @Test
    public void tshirtAddToCart(){
        LoginPage loginPage=new LoginPage(driver);
        InventoryPage inventoryPage=new InventoryPage(driver);
        TshirtPage tshirtPage=new TshirtPage(driver);

        loginPage.login("standard_user","secret_sauce");

        inventoryPage.shirtClickCheck();

        tshirtPage.addToCartTshirt();

        Assert.assertTrue(tshirtPage.isPressed());
    }
}
