package svetlanakussi.tests;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import static java.lang.Thread.sleep;

public class FindCarTest {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        driver.get("https://www.ss.com/lv");
        WebElement cars = driver.findElement(By.id("mtd_97"));
        cars.click();

        WebElement priceMin = driver.findElement(By.id("f_o_8_min"));
        priceMin.sendKeys("6000");

        WebElement priceMax = driver.findElement(By.id("f_o_8_max"));
        priceMax.sendKeys("10000");

        WebElement age = driver.findElement(By.id("f_o_18_min"));
        age.sendKeys("2001");

        WebElement engineMax = driver.findElement(By.id("f_o_15_max"));
        engineMax.sendKeys("3.0");

        Select Color = new Select (driver.findElement(By.id("f_o_17")));
        Color.selectByIndex (1);

        WebElement mekletButton = driver.findElement(By.className("s12"));
        mekletButton.click();

        sleep(5000);

        driver.quit();

    }
}
