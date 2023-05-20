package germans.testing;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindCarTest {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        driver.get("https://ss.com");
        WebElement viegliAuto = driver.findElement(By.id("mtd_97"));
        viegliAuto.click();
        WebElement enterPriceFrom = driver.findElement(By.id("f_o_8_min"));
        enterPriceFrom.click();
        enterPriceFrom.sendKeys("6000");
        WebElement enterPriceTo = driver.findElement(By.id("f_o_8_max"));
        enterPriceTo.click();
        enterPriceTo.sendKeys("10000");
        WebElement enterAge = driver.findElement(By.id("f_o_18_min"));
        enterAge.click();
        enterAge.sendKeys("2001");
        WebElement enterColor = driver.findElement(By.id("f_o_17"));
        boolean selected = enterColor.isSelected();
        enterColor.sendKeys("Balta");
        WebElement meklet = driver.findElement(By.className("s12"));
        meklet.click();

    }
}
