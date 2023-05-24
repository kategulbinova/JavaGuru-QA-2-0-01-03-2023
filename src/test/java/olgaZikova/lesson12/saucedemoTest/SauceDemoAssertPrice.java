package olgaZikova.lesson12.saucedemoTest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class SauceDemoAssertPrice extends BaseTest {

    @Test
    public void selectItem () {
        WebElement usernameField = driver.findElement(By.id("user-name"));
        usernameField.sendKeys("standard_user");

        WebElement passwordField = driver.findElement(By.id("password"));
        passwordField.sendKeys("secret_sauce");

        WebElement loginBtn = driver.findElement(By.id("login-button"));
        loginBtn.click();

        // WebElement priceBeforeAdd = driver.findElement(By.id("//div[@class='inventory_item' and div[@class='inventory_item_description']//div[@class='inventory_item_name' and text()='Sauce Labs Backpack']]//div[@class='inventory_item_price']"));
        // String oldPrice = priceBeforeAdd.getText();

        WebElement addToCardBtn = driver.findElement(By.xpath("//*[@id=\"add-to-cart-sauce-labs-backpack\"]"));
        addToCardBtn.click();

        WebElement basketBtn = driver.findElement(By.xpath("//*[@id=\"shopping_cart_container\"]/a/span"));
        basketBtn.click();

        WebElement newPrice = driver.findElement(By.xpath("//*[@id=\"cart_contents_container\"]/div/div[1]/div[3]/div[2]/div[2]/div"));

        // Assert.assertEquals(oldPrice,newPrice);
    }

}
