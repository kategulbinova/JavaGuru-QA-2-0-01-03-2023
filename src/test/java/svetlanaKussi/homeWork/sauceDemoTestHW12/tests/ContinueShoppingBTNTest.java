package svetlanaKussi.homeWork.sauceDemoTestHW12.tests;

import org.testng.annotations.Test;
import svetlanaKussi.homeWork.sauceDemoTestHW12.pages.LoginPage;
import svetlanaKussi.homeWork.sauceDemoTestHW12.pages.CartPage;
import svetlanaKussi.homeWork.sauceDemoTestHW12.pages.ProductsPage;


public class ContinueShoppingBTNTest extends BaseTest{
    @Test
    public void successfulContinueShoppingCheck() {
        LoginPage loginPage = new LoginPage();
        ProductsPage productsPage = new ProductsPage();
        CartPage cartPage = new CartPage ();

      //  loginPage.login("standard_user", "secret_sauce");

      //  productsPage.addToCart();

      //  cartPage.continueShoppingButtonID();
    }
}


