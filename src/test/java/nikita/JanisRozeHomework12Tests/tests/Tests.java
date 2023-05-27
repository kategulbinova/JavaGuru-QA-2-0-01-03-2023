package nikita.JanisRozeHomework12Tests.tests;

import nikita.JanisRozeHomework12Tests.pages.LoginPage;
import nikita.JanisRozeHomework12Tests.pages.MainPage;
import nikita.JanisRozeHomework12Tests.pages.ProfilePage;
import org.testng.Assert;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import static java.lang.Thread.sleep;

public class Tests extends BaseTest {
    @Test
    @Parameters({"username", "password"})
    public void loginSuccesfullCheck(String username, String password)  { //check that login is successfull
        MainPage mainPage = new MainPage(driver);
        LoginPage loginPage = new LoginPage(driver);
        ProfilePage profilePage = new ProfilePage(driver);

        mainPage.goToLoginPage();

        loginPage.login(username, password);

        Assert.assertTrue(profilePage.isOpen());

    }
    @Test
    @Parameters({"username", "password"})

    public void logoutFromProfilePageSuccesfullCheck(String username, String password) { //Check that logout works when initiated from the profile page
        MainPage mainPage = new MainPage(driver);
        LoginPage loginPage = new LoginPage(driver);
        ProfilePage profilePage = new ProfilePage(driver);

        mainPage.goToLoginPage();

        loginPage.login(username, password);

        profilePage.logout();

        Assert.assertTrue(driver.getCurrentUrl().contains("logoutSuccess"));


    }

    @Test
    @Parameters({"username", "password"})
    public void nameSurnameIsCorrectCheck(String username, String password) { //check that Name and Surname on profile page matches what is expected
        MainPage mainPage = new MainPage(driver);
        LoginPage loginPage = new LoginPage(driver);
        ProfilePage profilePage = new ProfilePage(driver);

        mainPage.goToLoginPage();

        loginPage.login(username, password);

        Assert.assertEquals(profilePage.getNameSurname(), "Abra Kadabra");

    }

}
