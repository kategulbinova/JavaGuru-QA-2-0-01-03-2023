package irinav.homework.loginTest;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import static java.lang.Thread.sleep;

public class LoginDemoTest {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        driver.get("http://www.saucedemo.com");

        WebElement userNameField = driver.findElement(By.id("user-name"));
        userNameField.sendKeys("standard_user");

        WebElement passwordField = driver.findElement(By.id("password"));
        passwordField.sendKeys("secret_sauce");

        WebElement loginButton = driver.findElement(By.id("login-button"));
        loginButton.click();

        String expURL = driver.getCurrentUrl();

        if (expURL.contains("inventory.html")) {
            System.out.println("Successful login to the website: " + expURL + ". Test passed.");
        } else {
            System.out.println("Test failed." + driver.findElement(By.cssSelector("[data-test=error]")).getText());
        }
        sleep(5000);
        driver.quit();
    }
}


