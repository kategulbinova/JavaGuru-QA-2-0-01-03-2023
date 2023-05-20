package marijaplumite2.classworks.janisroze.tests;

import marijaplumite2.classworks.janisroze.pages.LoginPage;
import marijaplumite2.classworks.janisroze.pages.ProfilsPage;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class LoginTest extends BaseTest{

    @Test
    @Parameters({"email", "password"})
    public void successfulLoginCheck(String email, String password){

        LoginPage loginPage = new LoginPage(driver, wait);
        ProfilsPage profilsPage = new ProfilsPage(driver);

        loginPage.login(email, password);
        profilsPage.isOpen();

    }
}
