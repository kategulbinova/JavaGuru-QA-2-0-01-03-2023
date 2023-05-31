package natuksa.saucedemo.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CartPage {
    private WebDriver driver;
    private String checkoutButtonId = "checkout";

    public CartPage(WebDriver driver) {this.driver = driver;}

    public void goToCheckoutPage() {
        WebElement checkoutButton = driver.findElement(By.id(checkoutButtonId));
        checkoutButton.click();
    }
}
