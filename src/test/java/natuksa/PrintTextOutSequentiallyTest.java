package natuksa;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.time.Duration;

public class PrintTextOutSequentiallyTest {
    WebDriver driver;
    WebDriverWait wait;
    @BeforeTest
    public void setUp() {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(2));
        driver.get("https://www.saucedemo.com");
    }
    @Test
    public void sauceDemoLogoutCheck() {
            WebElement loginField = driver.findElement(By.id("user-name"));
            loginField.sendKeys("standard_user");

            WebElement passwordField = driver.findElement(By.id("password"));
            passwordField.sendKeys("secret_sauce");

            WebElement submitButton = driver.findElement(By.id("login-button"));
            submitButton.click();

            WebElement burgerMenuIcon = driver.findElement(By.id("react-burger-menu-btn"));
            burgerMenuIcon.click();

            WebElement logoutButton = driver.findElement(By.id("logout_sidebar_link"));
            wait.until(ExpectedConditions.elementToBeClickable(logoutButton));
            logoutButton.click();
        }
    @AfterTest
    public void tearDown() {
        driver.quit();
        }
}


