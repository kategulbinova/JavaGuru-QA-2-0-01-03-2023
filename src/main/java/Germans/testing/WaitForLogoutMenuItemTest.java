package germans.testing;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class WaitForLogoutMenuItemTest {

        public static void main(String[] args) throws InterruptedException {
            WebDriver driver = new ChromeDriver();
            WebDriverManager.chromedriver().setup();

            FluentWait wait = new FluentWait(driver)
                    .withTimeout(Duration.ofMillis(5000))
                    .pollingEvery(Duration.ofMillis(500))
                    .ignoring(NoSuchElementException.class);


            driver.get("https://saucedemo.com");

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

            driver.quit();
        }
    }

