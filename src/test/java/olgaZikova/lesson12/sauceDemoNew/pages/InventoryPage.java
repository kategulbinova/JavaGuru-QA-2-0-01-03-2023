package olgaZikova.lesson12.sauceDemoNew.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

public class InventoryPage {
    private WebDriver driver;
    private String burgerMenuIconID = "react-burger-menu-btn";

    public InventoryPage(WebDriver driver) {
        this.driver = driver;
    }
    public boolean isOpenPage() {
        WebElement burgerMenuIcon = driver.findElement(By.id(burgerMenuIconID));

        if (burgerMenuIcon.isDisplayed()) return true;
        else return false;



    }
}


