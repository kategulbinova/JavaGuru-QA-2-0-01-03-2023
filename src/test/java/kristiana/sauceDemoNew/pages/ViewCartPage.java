package kristiana.sauceDemoNew.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import static java.lang.Thread.sleep;

public class ViewCartPage {
    private WebDriver driver;
    private String viewCartId = "shopping_cart_container";
    public ViewCartPage (WebDriver driver) {
        this.driver = driver;
    }
    public void viewPageOpen () {

        WebElement cartButton = driver.findElement(By.id(viewCartId));
        cartButton.click();

    }
    public boolean isOpen() {
        WebElement continueShoppingButton = driver.findElement(By.id("continue-shopping"));
        if (continueShoppingButton.isDisplayed()) return true;
        else return false;
    }
}