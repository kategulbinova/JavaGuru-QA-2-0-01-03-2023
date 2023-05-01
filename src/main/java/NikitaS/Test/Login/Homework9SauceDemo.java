package NikitaS.Test.Login;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import static java.lang.Thread.sleep;

public class Homework9SauceDemo {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver dr = new ChromeDriver();

        dr.get("https://www.saucedemo.com/");

        WebElement username = dr.findElement(By.id("user-name"));
        username.sendKeys("standard_user"); //Try other options instead of standard_user to see that test works fine for any user type scenario (exists, doesn't exist, banned)

        WebElement password = dr.findElement(By.id("password"));
        password.sendKeys("secret_sauce");

        WebElement login = dr.findElement(By.id("login-button"));
        login.click();

        if (dr.getCurrentUrl().contains("inventory")) {
            System.out.println("Login was successful");
        } else {
            System.out.println("Login was not successful");
        }

        sleep(5000);

        dr.quit();

    }
}