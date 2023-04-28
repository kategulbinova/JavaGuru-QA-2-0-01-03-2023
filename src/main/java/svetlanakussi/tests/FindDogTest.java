package svetlanakussi.tests;

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

        driver.get("https://www.ss.com/lv");
        WebElement doggo = driver.findElement(By.id("mtd_300"));
        doggo.click();

        WebElement ageMin = driver.findElement(By.id("f_o_1276_min"));
        ageMin.sendKeys("1");

        WebElement ageMax = driver.findElement(By.id("f_o_1276_max"));
        ageMax.sendKeys("1");

        WebElement mekletButton = driver.findElement(By.className("s12"));
        mekletButton.click();

        sleep(5000);

        driver.quit();

    }
}
