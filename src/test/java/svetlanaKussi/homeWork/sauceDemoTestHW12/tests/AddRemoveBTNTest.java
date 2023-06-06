package svetlanaKussi.homeWork.sauceDemoTestHW12.tests;

import org.testng.annotations.Test;
import svetlanaKussi.homeWork.sauceDemoTestHW12.pages.LoginPage;
import svetlanaKussi.homeWork.sauceDemoTestHW12.pages.ProductsPage;


public class AddRemoveBTNTest extends BaseTest{
    @Test
    public void successfulButtonCheck() {
        LoginPage loginPage = new LoginPage();
        ProductsPage productsPage = new ProductsPage();

       // loginPage.login("standard_user", "secret_sauce");

       // productsPage.testButtons();
    }
}
