package aleksejs_lukins.tests;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.sql.Driver;

import static java.lang.Thread.sleep;

public class Lesson9SeleniumFirstTest {

    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        driver.get("https://www.draugiem.lv");

        WebElement loginField = driver.findElement(By.id("email"));

        loginField.sendKeys("sescseces324");

        WebElement passwordField = driver.findElement(By.id("password"));
        passwordField.sendKeys("eservsrvsrvrdvrd");

        WebElement loginButton = driver.findElement(By.id("loginSubmit"));
        loginButton.click();

        sleep(5000);
        driver.quit();

    }

}