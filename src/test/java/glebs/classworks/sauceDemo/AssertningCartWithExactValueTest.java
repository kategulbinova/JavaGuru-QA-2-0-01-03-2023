package glebs.classworks.sauceDemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;


public class AssertningCartWithExactValueTest extends BaseTest {
    @Test
    @Parameters({"userName","password"})
    public void testCase1(String userName,String password){
        WebElement loginField=driver.findElement(By.xpath("//input[@placeholder='Username']"));
        loginField.sendKeys(userName);

        WebElement passwordField=driver.findElement(By.id("password"));
        passwordField.sendKeys(password);

        WebElement loginButton=driver.findElement(By.id("login-button"));
        loginButton.click();

        WebElement addBackpackToCart=driver.findElement(By.id("add-to-cart-sauce-labs-backpack"));
        //WebElement checkPriceBeforeAdd=driver.findElement(By.xpath("//div[@class='inventory_item_price']"));
        //String oldPrice=checkPriceBeforeAdd.getText();
        addBackpackToCart.click();

        WebElement clickingOnCart=driver.findElement(By.id("shopping_cart_container"));
        clickingOnCart.click();
        //WebElement ckeckingNewPrice=driver.findElement(By.xpath("//div[@class='inventory_item_price']"));
        //String newPrice=ckeckingNewPrice.getText();

        //Assert.assertEquals(oldPrice,newPrice);

        WebElement removingItemFromCart=driver.findElement(By.id("remove-sauce-labs-backpack"));
        removingItemFromCart.click();

        WebElement burgerMenu=driver.findElement(By.id("react-burger-menu-btn"));
        burgerMenu.click();

        WebElement waitAndPressLogout=driver.findElement(By.id("logout_sidebar_link"));
        wait.until(ExpectedConditions.elementToBeClickable(waitAndPressLogout));
        waitAndPressLogout.click();
    }
}
