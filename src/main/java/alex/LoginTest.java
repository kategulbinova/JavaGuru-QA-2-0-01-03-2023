package alex;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.Alert;
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
        WebElement emailInput = dr.findElement(By.id("email"));
        emailInput.sendKeys("MyLogin");
WebDriver pwdField = (WebDriver) (WebDriver) dr.findElement(By.id("password"));
        Alert myPassword = null;
        myPassword.sendKeys("qwerty12345");





        sleep(5000);



        dr.quit();
    }
}
