package gleb.tests.lesson9Test1;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import static java.lang.Thread.sleep;

public class LoginTest {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();

        driver.get("https://www.draugiem.lv");

        WebElement loginField= driver.findElement(By.id("email"));
        loginField.sendKeys("Popka 4ervya4ka ");

        WebElement passwordField= driver.findElement(By.id("password"));
        passwordField.sendKeys("Ne Popka 4ervya4ka ");

        WebElement ienaktButton= driver.findElement(By.id("loginSubmit"));
        ienaktButton.click();

        sleep(5000);
        driver.quit();
    }

}
