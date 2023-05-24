package irinaver.homework.sauceDemoNew.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ViewCartPage {
    private WebDriver driver;
    private String shoppingCartId = "shopping_cart_container";

    private String continueShoppingButtonId = "continue-shopping";
    private String checkOutButtonId = "checkout";


    public ViewCartPage(WebDriver driver){
        this.driver = driver;
    }
    public void shoppingCartDropDown(){
        WebElement shoppingCart = driver.findElement(By.id(shoppingCartId));
        shoppingCart.click();
    }
    public void continueShopping(){
        WebElement continueShoppingButton = driver.findElement(By.id(continueShoppingButtonId));
        continueShoppingButton.click();
    }

    public void checkOutButton(){
        WebElement checkOutButton = driver.findElement(By.id(checkOutButtonId));
        checkOutButton.click();
    }
    public Boolean isContinueShoppingDisplayed(){
        WebElement continueShopping = driver.findElement(By.id(continueShoppingButtonId));
        if (continueShopping.isDisplayed()) return true;
        else return false;
    }

}
