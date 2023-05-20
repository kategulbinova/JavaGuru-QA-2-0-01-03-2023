package teacher;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.*;

import java.time.Duration;

public class PrintTextOutSequentiallyTest {
    WebDriver driver;
    WebDriverWait wait;

    @BeforeMethod
    public void setUp() {
        driver = new ChromeDriver();
        WebDriverManager.chromedriver().setup();

        wait = new WebDriverWait(driver, Duration.ofSeconds(5));

        driver.get("https://saucedemo.com");
    }

    @Test
    public void sauceDemoLogoutCheck() {

        // Step 1: fill Login field
        WebElement loginField = driver.findElement(By.id("user-name"));
        loginField.sendKeys("standard_user");

        // Step 2: Fill password field
        WebElement passwordField = driver.findElement(By.id("password"));
        passwordField.sendKeys("secret_sauce");

        // Step 3: Click login button
        WebElement loginButton = driver.findElement(By.id("login-button"));
        loginButton.click();

        // Step 4: Click burger menu icon
        WebElement openMenuButton = driver.findElement(By.id("react-burger-menu-btn"));
        openMenuButton.click();

        // Step 5: Wait for Logout and click
        WebElement logoutMenuItem = driver.findElement(By.id("logout_sidebar_link"));
        wait.until(ExpectedConditions.elementToBeClickable(logoutMenuItem));
        logoutMenuItem.click();
    }

    @Test
    public void sauceDemoeFluentWaitTest() {

        //Declare and initialise a fluent wait
        WebElement loginField = driver.findElement(By.id("user-name"));
        loginField.sendKeys("standard_user");

        WebElement passwordField = driver.findElement(By.id("password"));
        passwordField.sendKeys("secret_sauce");

        WebElement loginButton = driver.findElement(By.id("login-button"));
        loginButton.click();

        WebElement openMenuButton = driver.findElement(By.id("react-burger-menu-btn"));
        openMenuButton.click();

        WebElement logoutMenuItem = driver.findElement(By.id("logout_sidebar_link"));
        wait.until(ExpectedConditions.elementToBeClickable(logoutMenuItem));
        logoutMenuItem.click();

    }

    @AfterMethod
    public void tearDown() {
        driver.quit();
    }

}
