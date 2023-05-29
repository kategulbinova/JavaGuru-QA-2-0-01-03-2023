package aleksejs_lukins.sauceDemo.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CartPage {
    private WebDriver driver; // null

    private String checkoutButtonId = "checkout";

    public CartPage(WebDriver driver) {
        this.driver = driver;
    }

    // assertion to see if we see checkout button
    public boolean isCartPageOpened() {
        WebElement sortingOptions = driver.findElement(By.id(checkoutButtonId));
        if ( sortingOptions.isDisplayed() )  return true;
        else return false;
    }
}
