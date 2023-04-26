package marijaplumite.tests;

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

        driver.get("https://ss.com/lv/");

        WebElement dogsPuppies = driver.findElement(By.id("mtd_300"));
        dogsPuppies.click();

        WebElement minAge = driver.findElement(By.id("f_o_1276_min"));
        minAge.click();
        minAge.sendKeys("1");

        WebElement maxAge = driver.findElement(By.id("f_o_1276_max"));
        maxAge.click();
        maxAge.sendKeys("1");


        WebElement searchButton = driver.findElement(By.className("s12"));
        searchButton.click();

        sleep(3000);

        driver.quit();
    }
}