package svetlanaKussi.homeWork.sauceDemoTestHW12.tests;


import org.testng.annotations.Test;
import svetlanaKussi.homeWork.sauceDemoTestHW12.pages.LoginPage;
import svetlanaKussi.homeWork.sauceDemoTestHW12.pages.ProductsPage;


public class LoginTest extends BaseTest{
    @Test
    public void successfulLoginCheck() {
        LoginPage loginPage = new LoginPage(driver);
        ProductsPage productsPage = new ProductsPage(driver);

        loginPage.login("standard_user", "secret_sauce");


    }
}
