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

        WebElement fieldUsername = driver.findElement(By.id("user-name"));
        fieldUsername.sendKeys("standard_user");

        sleep (2000);

        WebElement fieldPassword = driver.findElement(By.id("password"));
        fieldPassword.sendKeys("secret_sauce");

        sleep(2000);

        WebElement buttonLogin = driver.findElement(By.id("login-button"));
        buttonLogin.click();

        String currentUrl = driver.getCurrentUrl();
        System.out.println(currentUrl);

        if (link.contains("inventory")) {
            System.out.println();
            System.out.println("The url is " + currentUrl + " The result of the test is successful.");

        }
        else {
            System.out.println("The test is failed.");
        }

        sleep(2000);

        WebElement buttonMenu = driver.findElement(By.id("react-burger-menu-btn"));
        buttonMenu.click();

        sleep(1000);

        WebElement buttonLogout = driver.findElement(By.id("logout_sidebar_link"));
        buttonLogout.click();

        sleep(2000);

        //Test of the test
        fieldUsername = driver.findElement(By.id("user-name"));
        fieldUsername.sendKeys("standard_userr");

        fieldPassword = driver.findElement(By.id("password"));
        fieldPassword.sendKeys("secret_sauces");

        sleep(1000);

        buttonLogin = driver.findElement(By.id("login-button"));
        buttonLogin.click();

        sleep(5000);

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
