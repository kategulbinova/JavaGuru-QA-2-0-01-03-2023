package germans.testing;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindDogTest {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        driver.get("https://ss.com");
        WebElement suniUnKaki = driver.findElement(By.id("mtd_300"));
        suniUnKaki.click();
        WebElement ageFrom = driver.findElement(By.id("f_o_1276_min"));
        ageFrom.click();
        ageFrom.sendKeys("1");
        WebElement ageTo = driver.findElement(By.id("f_o_1276_max"));
        ageTo.click();
        ageTo.sendKeys("1");
        WebElement meklet = driver.findElement(By.className("s12"));


    }
}
