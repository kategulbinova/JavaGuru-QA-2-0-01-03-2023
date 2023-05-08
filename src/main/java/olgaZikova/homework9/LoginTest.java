package olgaZikova.homework9;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import static java.lang.Thread.sleep;

public class LoginTest {
    public static void main(String[] args) throws InterruptedException {

        boolean isInventory;
        String link = "https://www.saucedemo.com/inventory.html";

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        driver.get("https://www.saucedemo.com/");

        WebElement usernameField = driver.findElement(By.id("user-name"));
        usernameField.sendKeys("standard_user");

        WebElement passwordField = driver.findElement(By.id("password"));
        passwordField.sendKeys("secret_sauce");

        WebElement buttonLogin = driver.findElement(By.id("login-button"));
        buttonLogin.click();

        String currentUrl = driver.getCurrentUrl();
        System.out.println(currentUrl);

        if (driver.getCurrentUrl().contains("inventory")) {
            System.out.println();
            System.out.println("The url is " + currentUrl + " The result of the test is successful.");

        }
        else {
            System.out.println("The test is failed.");
        }

        WebElement buttonMenu = driver.findElement(By.id("react-burger-menu-btn"));
        buttonMenu.click();

        WebElement buttonLogout = driver.findElement(By.id("logout_sidebar_link"));
        buttonLogout.click();

        //Test of the test
        usernameField = driver.findElement(By.id("user-name"));
        usernameField.sendKeys("standard_userr");

        passwordField = driver.findElement(By.id("password"));
        passwordField.sendKeys("secret_sauces");

        buttonLogin = driver.findElement(By.id("login-button"));
        buttonLogin.click();

        if (driver.getCurrentUrl().contains("inventory")) {
            System.out.println();
            System.out.println("The url is " + currentUrl + " The result of the test is successful.");

        }
        else {
            System.out.println();
            System.out.println("The test is failed.");
        }

        driver.quit();
    }
}
