package teacher.testing;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import static java.lang.Thread.sleep;

public class FindDogTest {
    public static void main(String[] args) throws InterruptedException {

        WebDriverManager.chromedriver().setup();

        WebDriver driver = new ChromeDriver();
        driver.get("http://ss.lv");

        WebElement suniKuceniLink = driver.findElement(By.id("mtd_300"));
        suniKuceniLink.click();

        WebElement vecumsNoField = driver.findElement(By.id("f_o_1276_min"));
        vecumsNoField.sendKeys("1");

        WebElement vecumsLidzField = driver.findElement(By.id("f_o_1276_max"));
        vecumsLidzField.sendKeys("1");

        WebElement mekletButton = driver.findElement(By.className("s12"));
        mekletButton.click();

        sleep(5000);

        driver.quit();
    }
}
