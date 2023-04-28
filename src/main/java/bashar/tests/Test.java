package bashar.tests;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import static java.lang.Thread.sleep;

public class Test {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        driver.get("https://www.draugiem.lv");

        WebElement loginField = driver.findElement(By.id("email"));
        loginField.sendKeys("d@f.com");

        WebElement passwordField = driver.findElement(By.id("password"));
        passwordField.sendKeys("*******");

        sleep(5000);

        WebElement submitButton = driver.findElement(By.id("loginSubmit"));
        submitButton.click();

        sleep(5000);

        driver.quit();
    }
}
