package lpudnika;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import static java.lang.Thread.sleep;

public class Homework9SuccessfulLoginPracticeTest {
    public static void main(String[] args) throws InterruptedException{
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        driver.get("https://www.saucedemo.com/");

        WebElement usernameField = driver.findElement(By.id("user-name"));

        usernameField.sendKeys("standard_user");

        WebElement passwordField = driver.findElement(By.id("password"));

        passwordField.sendKeys("secret_sauce");

        sleep(5000);

        WebElement loginButton = driver.findElement(By.id("login-button"));
        loginButton.click();

        sleep(5000);

        if (driver.getCurrentUrl().contains("inventory.html")) {
            System.out.println("Login successful!");
        } else {
            System.out.println("Login failed: invalid username or password.");
        }

        driver.quit();
    }
}
