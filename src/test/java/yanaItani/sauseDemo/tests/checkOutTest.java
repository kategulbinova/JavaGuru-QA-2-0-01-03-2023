package yanaItani.sauseDemo.tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import yanaItani.sauseDemo.pages.CartPage;
import yanaItani.sauseDemo.pages.InventoryPage;
import yanaItani.sauseDemo.pages.LogInPage;

public class checkOutTest extends BaseTest {
    @Test
    public void successfulCheckOut(){
        LogInPage loginPage = new LogInPage(driver);
        CartPage cartpage = new CartPage(driver);
        InventoryPage inventorypage = new InventoryPage(driver);
        loginPage.login("standard_user","secret_sauce");
        inventorypage.addToCart();
        cartpage.checkOut();

        Assert.assertTrue(cartpage.checkoutSuccess());
        if (cartpage.checkoutSuccess()) {
            System.out.println("Checkout is complete, yaay");

        } else {
            System.out.println("not successful, try again");
        }


    }

}
