package margo.classWork;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.time.Duration;
public class Lect11AnnotationPracticeTest {
    WebDriver driver;
    WebDriverWait wait;
    @BeforeMethod
    public void setUp() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        wait = new WebDriverWait(driver, Duration.ofSeconds(2));

        driver.get("https://www.saucedemo.com/");
    }
    @Test
    public void sauceDemoLogoutCheck() {
        //Step 1 - fill login field
        WebElement usernameField = driver.findElement(By.id("user-name"));
        usernameField.sendKeys("standard_user");

        //Step 2 - fill password field
        WebElement passwordField = driver.findElement(By.id("password"));
        passwordField.sendKeys("secret_sauce");

        //Step 3 - Click login button
        WebElement loginButton = driver.findElement(By.id("login-button"));
        loginButton.click();

        //Step 4 - Click burger menu icon
        WebElement menuButton = driver.findElement(By.id("react-burger-menu-btn"));
        menuButton.click();

        //Step 5 - Wait for logout and click
        WebElement logoutItem = driver.findElement(By.id("logout_sidebar_link"));
        wait.until(ExpectedConditions.elementToBeClickable(logoutItem));
        logoutItem.click();
    }
    @Test
    public void sauceDemoFluentWaitTest() {
        //Step 1 - fill login field
        WebElement loginField = driver.findElement(By.id("user-name"));
        loginField.sendKeys("standard_user");

        //Step 2 - fill password field
        WebElement passwordField = driver.findElement(By.id("password"));
        passwordField.sendKeys("secret_sauce");

        //Step 3 - Click login button
        WebElement loginButton = driver.findElement(By.id("login-button"));
        loginButton.click();

        //Step 4 - Click burger menu icon
        WebElement openMenuButton = driver.findElement(By.id("react-burger-menu-btn"));
        openMenuButton.click();

        //Step 5 - Wait for logout and click
        WebElement logoutMenuItem = driver.findElement(By.id("logout_sidebar_link"));
        wait.until(ExpectedConditions.elementToBeClickable(logoutMenuItem));
        logoutMenuItem.click();
    }
    @AfterMethod
    public void tearDown() {
        driver.quit();
    }
}
