package romansmakna.homework10.tests;

import olgaZikova.homework12.sauceDemoTestHwrk.pages.LoginPage;
import olgaZikova.homework12.sauceDemoTestHwrk.pages.OneProductPage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class OneProductTest extends BaseTest {

    @Test
    public void successfulOpenProductPage () {
        LoginPage loginPage = new LoginPage(driver);
        OneProductPage oneProductPage = new OneProductPage(driver);

        loginPage.login("standard_user", "secret_sauce");
        oneProductPage.checkLinkToProductPage();

        Assert.assertTrue(oneProductPage.isOpenProductPage());
    }


}
