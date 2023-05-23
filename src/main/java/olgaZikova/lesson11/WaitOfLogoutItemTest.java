package olgaZikova.lesson11;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

import static java.lang.Thread.sleep;

public class WaitOfLogoutItemTest {
    public static void main(String[] args) throws InterruptedException {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(2));

        driver.get("https://www.saucedemo.com/");

        WebElement usernameField = driver.findElement(By.id("user-name"));
        usernameField.sendKeys("standard_user");

        WebElement passwordField = driver.findElement(By.id("password"));
        passwordField.sendKeys("secret_sauce");

        WebElement buttonLogin = driver.findElement(By.id("login-button"));
        buttonLogin.click();


        WebElement menuButton = driver.findElement(By.id("react-burger-menu-btn"));
        menuButton.click();

        WebElement logoutMenuButton = driver.findElement(By.id("logout_sidebar_link"));
        logoutMenuButton.click();

        wait.until(ExpectedConditions.elementToBeClickable(logoutMenuButton));
        logoutMenuButton.click();

        driver.quit();

    }


}