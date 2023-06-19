package germans.sauceDemo.tests;


import germans.sauceDemo.pages.InventoryPage;
import germans.sauceDemo.pages.LoginPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class LogoutTest extends BaseTest {
    @Test
    public void successfulLogoutCheck(String standardUser, String secretSauce) {

        LoginPage loginPage = new LoginPage(driver);
        InventoryPage InventoryPage = new InventoryPage(driver);

        
        loginPage.login(standardUser,secretSauce);

        
        Assert.assertTrue(InventoryPage.isOpen());

        
        InventoryPage.isOpen();

        
        Assert.assertTrue(loginPage.isOpen());


    }
}
