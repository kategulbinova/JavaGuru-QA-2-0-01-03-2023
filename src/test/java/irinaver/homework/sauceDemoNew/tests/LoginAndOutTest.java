package irinaver.homework.sauceDemoNew.tests;

import irinaver.homework.sauceDemoNew.pages.InventoryPage;
import irinaver.homework.sauceDemoNew.pages.LoginPage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginAndOutTest extends BaseTest{
    @Test
    public void loginLogoutCheck(){
        LoginPage loginPage = new LoginPage();
        InventoryPage inventoryPage  = new InventoryPage();

        loginPage.login("standard_user", "secret_sauce");
        //add asserts

        Assert.assertTrue(inventoryPage.isOpen());
        loginPage.logout();
    }
}
