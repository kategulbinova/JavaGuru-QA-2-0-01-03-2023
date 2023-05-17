package aleksejs_lukins.PracticeLesson8VehiclePark.YanaItani.seleniumtest;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;

import static java.lang.Thread.sleep;

public class seleniumTest {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver dr = new ChromeDriver();

        dr.get("https://www.draugiem.lv");

        WebElement loginField = dr.findElement(By.id("email"));
        loginField.sendKeys("123456789");
        WebElement pwdField = dr.findElement(By.id("password"));
        loginField.sendKeys("qwerty123456789");
        WebElement ienaktButton = dr.findElement(By.id("loginSubmit"));
        ienaktButton.click();

        sleep(5000);

        dr.quit();

    }

}
