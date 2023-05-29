package kristiana.lesson9Tests;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import static java.lang.Thread.sleep;

public class LoginTests {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        driver.get("https://www.draugiem.lv");

        WebElement loginField = driver.findElement(By.id("email"));
        loginField.sendKeys("kristiana12345");

        WebElement pwdfield = driver.findElement(By.id("password"));
        pwdfield.sendKeys("parolj123");

        WebElement ienakt = driver.findElement(By.id("loginSubmit"));
        ienakt.click();

        sleep(5000);

        driver.quit();
    }
}
