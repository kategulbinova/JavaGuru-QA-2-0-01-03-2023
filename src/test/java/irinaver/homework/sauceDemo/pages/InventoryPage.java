package irinaver.homework.sauceDemo.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class InventoryPage {
    private WebDriver driver;

    private String burgerMenuIconId = "react-burger-menu-btn";
    private String logoutMenuItemId = "logout_sidebar_link";

    public InventoryPage(WebDriver driver) {
        this.driver = driver;
    }

    public Boolean isOpen() {
        WebElement burgerMenuIcon = driver.findElement(By.id(burgerMenuIconId));
        if ( burgerMenuIcon.isDisplayed() ) return true;
        else return false;
    }
}

