package germans.sauceDemo.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class LogoutPage {
    private WebDriver driver;

    private String burgerMenuId = "react-burger-menu-btn";
    private String  logoutButtonId = "logout_sidebar_link";
    private String loginButtonId = "login-button";

    public LogoutPage(WebDriver driver) {
        this.driver = driver;
    }

    public void logout() {
        WebElement burgerButton = driver.findElement(By.id(burgerMenuId));
        WebElement logoutButton = driver.findElement(By.id(logoutButtonId));
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));

        burgerButton.click();

        WebElement logoutMenuItem = driver.findElement(By.id(logoutButtonId));
        wait.until(ExpectedConditions.elementToBeClickable(logoutMenuItem));

        logoutButton.click();
    }

    public boolean isOpen() {
        WebElement burgerMenuIcon = driver.findElement(By.id(loginButtonId));

        if ( burgerMenuIcon.isDisplayed() )  return true;
        else return false;
    }
}

