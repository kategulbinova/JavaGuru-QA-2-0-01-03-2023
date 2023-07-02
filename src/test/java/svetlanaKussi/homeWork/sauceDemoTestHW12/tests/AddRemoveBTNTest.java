package svetlanaKussi.homeWork.sauceDemoTestHW12.tests;

import org.testng.annotations.Test;
import svetlanaKussi.homeWork.sauceDemoTestHW12.pages.CartPage;
import svetlanaKussi.homeWork.sauceDemoTestHW12.pages.LoginPage;
import svetlanaKussi.homeWork.sauceDemoTestHW12.pages.ProductsPage;


public class AddRemoveBTNTest extends BaseTest{
    @Test
    public void successfulButtonCheck() {
        LoginPage loginPage = new LoginPage(driver);
        ProductsPage productsPage = new ProductsPage(driver);
        CartPage cartPage = new CartPage(driver);

       loginPage.login("standard_user", "secret_sauce");

       productsPage.addToCart();

       productsPage.removeFromCart();

       cartPage.goToCart();

        assert cartPage.isCartEmpty() : "Cart is not empty";


    }
}
