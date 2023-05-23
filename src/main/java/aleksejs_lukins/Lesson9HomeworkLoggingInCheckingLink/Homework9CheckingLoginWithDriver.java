package aleksejs_lukins.Lesson9HomeworkLoggingInCheckingLink;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import static java.lang.Thread.sleep;

public class Homework9CheckingLoginWithDriver {

    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        String actualLink;

        driver.get("https://www.saucedemo.com/");

        WebElement loginField = driver.findElement(By.id("user-name"));
        loginField.sendKeys("standard_user");

        WebElement passwordField = driver.findElement(By.id("password"));
        passwordField.sendKeys("secret_sauce");

        WebElement loginButton = driver.findElement(By.id("login-button"));
        loginButton.click();

        actualLink = driver.getCurrentUrl();

        if (actualLink.contains("inventory")) {
            System.out.println("Login confirmed");
        }
        else {
            System.out.println("Login failed, current URL does not contain 'inventory' text");
        }

        sleep(5000);
        driver.quit();
    }
}