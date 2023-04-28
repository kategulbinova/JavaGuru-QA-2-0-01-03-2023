package teacher.testing;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import static java.lang.Thread.sleep;

public class LoginTest {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver dr = new ChromeDriver();

        dr.get("https://www.draugiem.lv");

        WebElement loginField = dr.findElement(By.id("email"));
        loginField.sendKeys("kate1234561234561");

        WebElement pwdField = dr.findElement(By.id("password"));
        pwdField.sendKeys("qwerty123456");

        WebElement ienaktButton = dr.findElement(By.id("loginSubmit"));
        ienaktButton.click();

        dr.quit();
    }
}
