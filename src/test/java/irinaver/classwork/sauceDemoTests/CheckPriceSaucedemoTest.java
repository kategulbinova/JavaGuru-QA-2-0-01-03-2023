package irinaver.classwork.sauceDemoTests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class CheckPriceSaucedemoTest extends BaseTest {
    @Test
    @Parameters({"good_login", "good_password"})

   public void checkPriceIsTheSame(String login, String password) {

   // Login
        WebElement loginField = driver.findElement(By.id("user-name"));
        WebElement passwordField = driver.findElement(By.id("password"));
        WebElement loginButton = driver.findElement(By.id("login-button"));
        loginField.sendKeys(login);
        passwordField.sendKeys(password);
        loginButton.click();

        // Add backpack to cart
        WebElement addBackPackButton = driver.findElement(By.id("add-to-cart-sauce-labs-backpack"));
        addBackPackButton.click();

        // Switch to cart and check new price
        WebElement shoppingCartIcon = driver.findElement(By.id("shopping_cart_container"));
        shoppingCartIcon.click();
        WebElement removeBackPackButton = driver.findElement(By.id("remove-sauce-labs-backpack"));
        removeBackPackButton.click();

       //div[@class ='inventory_item_price'] )
    }

}

