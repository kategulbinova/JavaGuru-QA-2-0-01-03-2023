package margo.homeWorks.lect9WebDriverLocators;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import static java.lang.Thread.sleep;

public class SaucedemoLoginTest {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        driver.get("https://www.saucedemo.com/");

        WebElement usernameField = driver.findElement(By.id("user-name"));
        usernameField.sendKeys("standard_user");

        WebElement passwordField = driver.findElement(By.id("password"));
        passwordField.sendKeys("secret_sauce");

        sleep(1000);

        WebElement loginButton = driver.findElement(By.id("login-button"));
        loginButton.click();

        if (driver.getCurrentUrl().contains("inventory")) {
            System.out.println("The login process was successful!");
        }
        else {
            System.out.println("The login failed! Either username or password is incorrect");
        }
        sleep(2000);

        driver.quit();
    }
}
