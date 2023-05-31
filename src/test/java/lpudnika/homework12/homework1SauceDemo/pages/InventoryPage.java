package lpudnika.homework12.homework1SauceDemo.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class InventoryPage {

    //save driver and element locators as object fields of type String
    private WebDriver driver;

    private WebDriverWait wait;

    private String burgerMenuIconId = "react-burger-menu-btn";

    private String aboutButtonId = "about_sidebar_link";

    //initialize WebDriver in constructor
    public InventoryPage(WebDriver driver, WebDriverWait wait){
        this.driver = driver;
        this.wait=wait;
    }

    //Check whether burger menu icon is now visible
    public boolean isOpen(){
        WebElement burgerMenuIcon = driver.findElement(By.id(burgerMenuIconId));
        if ( burgerMenuIcon.isDisplayed() ) return true;
        else return false;
    }

    public void openMenu(){

        WebElement burgerMenuButton = driver.findElement(By.id(burgerMenuIconId));
        burgerMenuButton.click();
    }

    public void openAboutPage() {
        WebElement aboutButton = driver.findElement(By.id(aboutButtonId));

        wait.until(ExpectedConditions.elementToBeClickable(aboutButton));
        aboutButton.click();

    }
}
