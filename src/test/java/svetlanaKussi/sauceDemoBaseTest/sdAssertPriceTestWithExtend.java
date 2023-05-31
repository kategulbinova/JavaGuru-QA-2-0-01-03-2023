package svetlanaKussi.sauceDemoBaseTest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class sdAssertPriceTestWithExtend extends BaseTest {

    @Test
    @Parameters({"good_login", "good_password"})
    public void checkPriceIsTrue(String login, String pass){

        WebElement loginField = driver.findElement(By.id("user-name"));
        WebElement passField = driver.findElement(By.id("password"));
        WebElement loginButton = driver.findElement(By.id("login-button"));
        loginField.sendKeys(login);
        passField.sendKeys(pass);
        loginButton.click();

        //WebElement addBackPackButton = driver.findElement(By.id("add-to-cart-sauce-labs-backpack"));
        //WebElement backPackPriceBeforeAdd = driver.findElement(By.xpath("//div[@class='add-to-cart-sauce-labs-backpack']"));
        //String oldPrice = backPackPriceBeforeAdd.getText();
        //addBackPackButton.click();

        //WebElement shoppingCartIcon = driver.findElement(By.id("shopping_cart_container"));
        //shoppingCartIcon.click();

        //WebElement backPackPriceAfterAdd = driver.findElement(By.xpath("//div[@class='add-to-cart-sauce-labs-backpack']"));
        //String newPrice = backPackPriceAfterAdd.getText();

        //Assert.assertEquals(oldPrice, newPrice);

        //WebElement removeBackPackButton = driver.findElement(By.id("remove-sauce-labs-backpack"));
        //removeBackPackButton.click();
    }

}


