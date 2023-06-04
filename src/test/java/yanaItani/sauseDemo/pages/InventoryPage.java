package yanaItani.sauseDemo.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;

public class InventoryPage {
    private WebDriver driver;
    private WebDriverWait wait;
    private String addToCartID = "add-to-cart-sauce-labs-backpack";

    private String cartID = "shopping_cart_container";

    public InventoryPage(WebDriver driver) {
            this.driver = driver;
    }

    public void addToCart() {
        WebElement addToCart = driver.findElement(By.id(addToCartID));
        WebElement cart = driver.findElement(By.id(cartID));

        addToCart.click();
        cart.click();
    }
}
