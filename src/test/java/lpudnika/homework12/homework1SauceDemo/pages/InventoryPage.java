package lpudnika.homework12.homework1SauceDemo.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class InventoryPage {

    //save driver and element locators as object fields of type String
    private WebDriver driver;

    private String burgerMenuIconId = "react-burger-menu-btn";

    //initialize WebDriver in constructor
    public InventoryPage(WebDriver driver){
        this.driver = driver;
    }

    //Check whether burger menu icon is now visible
    public boolean isOpen(){
        WebElement burgerMenuIcon = driver.findElement(By.id(burgerMenuIconId));
        if ( burgerMenuIcon.isDisplayed() ) return true;
        else return false;
    }

}
