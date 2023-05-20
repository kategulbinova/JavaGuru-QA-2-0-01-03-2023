package marijaplumite2.classworks.janisroze.tests;

import marijaplumite2.classworks.janisroze.pages.ChangeDetailsPage;
import marijaplumite2.classworks.janisroze.pages.LoginPage;
import org.testng.Assert;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ChangeProfileDetailsTest extends  BaseTest {

    @Test
    @Parameters({"email", "password"})
    public void checkProductAddingToCart(String email, String password){
        LoginPage loginPage = new LoginPage(driver, wait);
        ChangeDetailsPage changeDetailsPage = new ChangeDetailsPage(driver, wait);

        loginPage.login(email, password);
        changeDetailsPage.changeProfileInfo();

        Assert.assertTrue(changeDetailsPage.isOpen());

    }
}
