package kristiana.sauceDemoNew.tests;

import kristiana.sauceDemoNew.pages.TShirtPage;
import olgaZikova.homework12.sauceDemoTestHwrk.pages.LoginPage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TShirtTest extends BaseTest{
    @Test
    public void tShirtPageOpenCheck () {
        LoginPage loginPage = new LoginPage(driver);
        TShirtPage tShirtPage = new TShirtPage(driver);

        loginPage.login("standard_user", "secret_sauce");
        tShirtPage.checkLinkToTShirtPage();
        Assert.assertTrue(tShirtPage.isOpenTshirtPage());


    }
}
