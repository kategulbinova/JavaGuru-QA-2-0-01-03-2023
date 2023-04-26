package marijaplumite.tests;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import static java.lang.Thread.sleep;

public class Test1 {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        driver.get("https://draugiem.lv");

        WebElement loginField = driver.findElement(By.id("email"));
        loginField.sendKeys("marijamail.lv");

        WebElement passwordField = driver.findElement(By.id("password"));
        passwordField.sendKeys("makapes98725");

        sleep(3000);

        WebElement ienaktButton = driver.findElement(By.id("loginSubmit"));
        ienaktButton.click();

        sleep(5000);

        driver.quit();
    }
}
