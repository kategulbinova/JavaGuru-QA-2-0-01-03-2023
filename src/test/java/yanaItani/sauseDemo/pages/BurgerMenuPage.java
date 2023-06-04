package yanaItani.sauseDemo.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class BurgerMenuPage {
    private WebDriver driver;
    private WebDriverWait wait;

    public String burgerIconId = "react-burger-menu-btn";
    public String logOutButtonID = "logout_sidebar_link";

    public BurgerMenuPage(WebDriver driver) {
        this.driver = driver;
    }
    public void logOut() {
        WebElement burgerIconn = driver.findElement(By.id(burgerIconId));
        burgerIconn.click();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(2));
        WebElement logoutButton = driver.findElement(By.id(logOutButtonID));
        wait.until(ExpectedConditions.elementToBeClickable(logoutButton));

        logoutButton.click();

    }

}
