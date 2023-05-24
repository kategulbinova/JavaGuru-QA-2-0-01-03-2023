package lpudnika.homework12.homework1SauceDemo.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class YourCartPage {
    //save driver and element locators as object fields of type String
    private static WebDriver driver;
    private String shoppingCartIconId = "shopping_cart_container";

    private static String checkoutButtonId = "checkout";

    //initialize WebDriver in constructor
    public YourCartPage(WebDriver driver){
        this.driver = driver;
    }

    //Open cart
    public void shoppingCart(){
        //Initialize elements inside methods
        WebElement shoppingCartItem = driver.findElement(By.id(shoppingCartIconId));
        shoppingCartItem.click();
    }

    //Check whether page is opened
    public static boolean isOpen(){
        WebElement checkoutButton = driver.findElement(By.id(checkoutButtonId));
        if ( checkoutButton.isDisplayed() ) return true;
        else return false;
    }
}
