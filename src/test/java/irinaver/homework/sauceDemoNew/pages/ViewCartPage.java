package irinaver.homework.sauceDemoNew.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import static irinaver.homework.sauceDemoNew.utils.DriverProvider.getCurrentDriver;

public class ViewCartPage {
    private String shoppingCartId = "shopping_cart_container";
    private String continueShoppingButtonId = "continue-shopping";
    private String checkOutButtonId = "checkout";

    public void shoppingCartDropDown(){
        WebElement shoppingCart = getCurrentDriver().findElement(By.id(shoppingCartId));
        shoppingCart.click();
    }
    public void continueShopping(){
        WebElement continueShoppingButton = getCurrentDriver().findElement(By.id(continueShoppingButtonId));
        continueShoppingButton.click();
    }
    public void checkOutButton(){
        WebElement checkOutButton = getCurrentDriver().findElement(By.id(checkOutButtonId));
        checkOutButton.click();
    }
    public Boolean isContinueShoppingDisplayed(){
        WebElement continueShopping = getCurrentDriver().findElement(By.id(continueShoppingButtonId));
        if (continueShopping.isDisplayed()) return true;
        else return false;
    }

}
