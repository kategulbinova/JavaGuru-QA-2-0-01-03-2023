package bashar.tests;

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

        WebElement dogsPuppiesLink = driver.findElement(By.id("mtd_300"));
        dogsPuppiesLink.click();

        WebElement minAge = driver.findElement(By.id("f_o_1276_min"));
        minAge.sendKeys("1");

        WebElement maxAge = driver.findElement(By.id("f_o_1276_max"));
        maxAge.sendKeys("1");

        sleep(5000);

        WebElement searchButton = driver.findElement(By.xpath("//*[@id=\"filter_tbl\"]" +
                "/tbody/tr/td[2]/input"));
        searchButton.click();

        sleep(5000);

        driver.quit();
    }
}
