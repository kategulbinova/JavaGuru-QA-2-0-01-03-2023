package lpudnika.homework12.homework1SauceDemo.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AboutPage {
    //save driver and element locators as object fields of type String
    private WebDriver driver;
    private WebDriverWait wait;
    private String burgerMenuIconId = "react-burger-menu-btn";

    private String aboutButtonId = "about_sidebar_link";

    //initialize WebDriver in constructor
    public AboutPage(WebDriver driver) {
        this.driver = driver;
    }

    //Check whether burger menu icon is now visible
    public boolean isOpen() {
        WebElement tryItFreeButton = driver.findElement(By.xpath("//*[@id='__next']/div[2]/div[1]/div/div[1]/div[1]/div/div[4]/div[1]/a/button"));
        if ( tryItFreeButton.isDisplayed() ) return true;
        else return false;
    }
}
