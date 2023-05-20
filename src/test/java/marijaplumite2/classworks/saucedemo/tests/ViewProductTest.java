package marijaplumite2.classworks.saucedemo.tests;

import marijaplumite2.classworks.saucedemo.pages.LoginPage;
import marijaplumite2.classworks.saucedemo.pages.ViewProductPage;
import org.testng.Assert;
import org.testng.annotations.Test;


public class ViewProductTest extends BaseTest{

    @Test
    public void checkProductInfo(){
        LoginPage loginPage = new LoginPage(driver);
        ViewProductPage viewProductPage = new ViewProductPage(driver);

        loginPage.login("standard_user", "secret_sauce");

        viewProductPage.selectProd();

        Assert.assertTrue( viewProductPage.isOpen() );
    }
}
