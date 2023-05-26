package kristiana.lesson9Tests;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import static java.lang.Thread.sleep;

public class PuppiesPractise {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        driver.get("https://www.ss.com/lv/");

        WebElement dogsPuppies = driver.findElement(By.id("mtd_300"));
        dogsPuppies.click();

        WebElement ageFrom = driver.findElement(By.id("f_o_1276_min"));
        ageFrom.sendKeys("1");

        WebElement ageTo = driver.findElement(By.id("f_o_1276_max"));
        ageTo.sendKeys("1");

        WebElement meklet = driver.findElement(By.className("s12"));
        meklet.click();

        sleep(5000);

        driver.quit();







    }
}
