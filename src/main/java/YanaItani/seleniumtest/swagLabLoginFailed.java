package YanaItani.seleniumtest;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import static java.lang.Thread.sleep;

public class swagLabLoginFailed {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        driver.get("https://www.saucedemo.com");
        WebElement usernameField = driver.findElement(By.id("user-name"));
        usernameField.sendKeys("standard_user");
        WebElement password = driver.findElement(By.id("password"));
        password.sendKeys("secret_sauceeeeee");
        WebElement loginButton = driver.findElement(By.id("login-button"));
        loginButton.click();
        System.out.println(driver.getCurrentUrl());
        if (driver.getCurrentUrl().contains("inventory.html"))
        {
            System.out.println("Login successful");

        }
        else {

            WebElement error = driver.findElement(By.tagName("h3"));
            System.out.println(error.getText());
        }



        sleep(5000);

        driver.quit();


    }
}

