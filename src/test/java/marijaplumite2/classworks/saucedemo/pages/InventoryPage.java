package marijaplumite2.classworks.saucedemo.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class InventoryPage {
    private WebDriver driver; //null

    private String burgerMenuIconId = "react-burger-menu-btn";

    public InventoryPage(WebDriver driver){
        this.driver = driver;
    }

    public boolean isOpen(){
        WebElement burgerMenuIcon = driver.findElement(By.id("react-burger-menu-btn"));

        if ( burgerMenuIcon.isDisplayed() ) return true;
        else return false;
    }

}