package paula.workInClass.testing;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import static java.lang.Thread.sleep;

public class FindDogTesting {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.ss.com");

        WebElement suniButton = driver.findElement(By.id("mtd_300"));
        suniButton.click();

        WebElement vecumsFieldFrom = driver.findElement(By.id("f_o_1276_min"));
        vecumsFieldFrom.sendKeys("1");

        WebElement vecumsFieldTill = driver.findElement(By.id("f_o_1276_max"));
        vecumsFieldTill.sendKeys("1");

        WebElement mekletButton = driver.findElement(By.className("s12"));
        mekletButton.click();

        sleep(5000);

        driver.quit();
    }
}
