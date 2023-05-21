package irinaver.classwork;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeTest;

import java.time.Duration;

public class PrintTextOutTest {
    WebDriver driver;
    WebDriver wait;
    @BeforeTest
    public void setUp(){
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));

        driver.get("https://www.saucedemo.com");

    //public void sauceDemoLogoutCheck

    WebElement userNameField = driver.findElement(By.id("user-name"));
        userNameField.sendKeys("standard_user");

    WebElement passwordField = driver.findElement(By.id("password"));
        passwordField.sendKeys("secret_sauce");

    WebElement loginBtn = driver.findElement(By.id("login-button"));
        loginBtn.click();

    WebElement menuBurgerIcon = driver.findElement(By.id("react-burger-menu-btn"));
        menuBurgerIcon.click();

    WebElement logoutMenuItem = driver.findElement(By.id("logout_sidebar_link"));
        wait.until(ExpectedConditions.elementToBeClickable(logoutMenuItem));
        logoutMenuItem.click();

        driver.quit();
}
}




