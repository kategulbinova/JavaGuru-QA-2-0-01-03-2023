package margo.classWork.tests;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import static java.lang.Thread.sleep;

public class FirstTest {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        driver.get("https://www.draugiem.lv");

        WebElement emailField = driver.findElement(By.id("email"));
        emailField.sendKeys("someemail@email.email");

        WebElement passwordField = driver.findElement(By.id("password"));
        passwordField.sendKeys("testpassword");

        WebElement ienaktButton = driver.findElement(By.id("loginSubmit"));
        ienaktButton.click();

        sleep(5000);

        driver.quit();
    }
}
