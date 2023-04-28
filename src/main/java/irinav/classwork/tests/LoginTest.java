package irinav.classwork.tests;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


import static java.lang.Thread.sleep;

public class LoginTest {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        driver.get("http://www.draugiem.lv");

        WebElement  myEmail = driver.findElement(By.id("email"));
        myEmail.sendKeys("iren7465");

        WebElement myPassword = driver.findElement(By.id("password"));
        myPassword.sendKeys("qwrtt67899");

        sleep(5000);

        WebElement ienaktButton = driver.findElement(By.id("loginSubmit"));
        ienaktButton.click();

        sleep(5000);
        driver.quit();
    }
}
