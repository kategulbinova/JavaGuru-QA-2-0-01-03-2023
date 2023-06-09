package teacher.testing;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;

import java.time.Duration;

public class SauceDemoMenuFluentWaitTest {
    public static void main(String[] args) throws InterruptedException {

        WebDriverManager.chromedriver().setup();
        org.openqa.selenium.WebDriver driver = new ChromeDriver();

        //Declare and initialise a fluent wait
        FluentWait wait = new FluentWait(driver)
                .withTimeout(Duration.ofMillis(5000))
                .pollingEvery(Duration.ofMillis(250))
                .ignoring(NoSuchElementException.class);

        driver.get("https://www.saucedemo.com/");

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
