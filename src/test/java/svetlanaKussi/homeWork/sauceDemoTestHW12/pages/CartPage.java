package svetlanaKussi.homeWork.sauceDemoTestHW12.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class CartPage {
    public WebDriver driver;
    public String cartButtonXpath= "//a[@class='shopping_cart_link']";
    public String continueShoppingButtonXpath = "//button[@data-test='continue-shopping']";



    public CartPage(WebDriver driver) {
        this.driver = driver;
    }

    public void goToCart(){
        WebElement cartButton = driver.findElement(By.xpath(cartButtonXpath));
        cartButton.click();
    }

    public void continueShopping() {
        WebElement continueShoppingButton = driver.findElement(By.xpath(continueShoppingButtonXpath));

        continueShoppingButton.click();
    }
    public Boolean isCartEmpty() {
        List<WebElement> cartItems = driver.findElements(By.className("cart_item"));
        return cartItems.isEmpty();
    }


}
