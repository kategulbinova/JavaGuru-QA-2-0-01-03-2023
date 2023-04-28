package germans.testing;


import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import static java.lang.Thread.sleep;

public class TestLogin {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        driver.get("https://draugiem.lv");
        WebElement loginField = driver.findElement(By.id("email"));
        loginField.sendKeys("Germans122345");
        WebElement pwdElement = driver.findElement(By.id("password"));
        pwdElement.sendKeys("whcbewbch");
        WebElement ienaktButton = driver.findElement(By.id("Loginsubmit"));
        ienaktButton.click();
        sleep(5000);
        driver.quit();
    }
}
