package irinav.homework.loginTest;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import static java.lang.Thread.sleep;

public class BonusTaskRiepas {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        WebElement menuField = driver.findElement(By.xpath("//[li@id='department-4579']/a/span]"));
        menuField.click();

        driver.get("http:220.lv");
        sleep(5000);
        driver.quit();
    }
}
