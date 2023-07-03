package margo.classWork.sauceDemoTests.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class InventoryPage {
    private WebDriver driver;
    private String burgerMenuIconId = "react-burger-menu-btn";
    private String bikeLightImg = "//img[@alt='Sauce Labs Bike Light']";
    public InventoryPage(WebDriver driver) {
        this.driver = driver;
    }
    public Boolean isOpened() {
        WebElement burgerMenuIcon = driver.findElement(By.id("react-burger-menu-btn"));
        if ( burgerMenuIcon.isDisplayed() ) return true;
        else return false;
    }
    public void clickOnBikeLightProduct() {
        //Initialized element
        WebElement bikeLightItem = driver.findElement(By.xpath(bikeLightImg));

        //Choose specific item from all products
        bikeLightItem.click();
    }

}
