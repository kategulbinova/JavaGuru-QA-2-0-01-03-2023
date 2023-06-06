package svetlanaKussi.homeWork.sauceDemoTestHW12.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CartPage {
    public WebDriver driver;
    public String cartButtonID = "shopping_cart_container";
    public String continueShoppingButtonID = "continue-shopping";


    public void continueShopping(){
        WebElement cartButton = driver.findElement(By.id(cartButtonID));
        WebElement continueShoppingButton = driver.findElement(By.id(continueShoppingButtonID));

        cartButton.click();
        continueShoppingButton.click();

    }

    public void continueShoppingButtonID() {
        WebElement cartButton = driver.findElement(By.id(cartButtonID));
        WebElement continueShoppingButton = driver.findElement(By.id(continueShoppingButtonID));

        cartButton.click();
        continueShoppingButton.click();
    }
}
