package aleksejs_lukins.tests;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import static java.lang.Thread.sleep;

public class Lesson9SeleniumExploreDogsTest {

    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        driver.get("https://www.ss.com/lv/");

        WebElement findADog = driver.findElement(By.id("mtd_300"));
        findADog.click();

        WebElement findStartingAge = driver.findElement(By.id("f_o_1276_min"));
        findStartingAge.sendKeys("1");

        WebElement findEndAge = driver.findElement(By.id("f_o_1276_max"));
        findEndAge.sendKeys("1");

        WebElement findSearchButton = driver.findElement(By.xpath("//*[@id=\"filter_tbl\"]/tbody/tr/td[2]/input"));
        findSearchButton.click();

        sleep(5000);
        driver.quit();

    }

}
