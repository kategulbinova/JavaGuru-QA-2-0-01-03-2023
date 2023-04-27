package marijaplumite.tests;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


import static java.lang.Thread.sleep;

public class HomeworkSaucedemoLoginTest {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        driver.get("https://www.saucedemo.com/");

        WebElement usernameField = driver.findElement(By.id("user-name"));
        usernameField.click();
        usernameField.sendKeys("standard_user");

        sleep(1000);

        WebElement passwordField = driver.findElement(By.id("password"));
        passwordField.click();
        passwordField.sendKeys("secret_sauce");

        sleep(1000);

        WebElement loginButton = driver.findElement(By.id("login-button"));
        loginButton.click();

        String currentUrl = driver.getCurrentUrl();
        if (currentUrl.contains("inventory")){
            System.out.println("Login successful!");
        } else {
            System.out.println("Login failed: " + driver.findElement(By.cssSelector("h3")).getText()); // Google helped again :D
        }

        sleep(2000);

        driver.quit();
    }
}