package marijaplumite.tests;

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

            driver.get("https://ss.com/lv/");

            WebElement vieglieAutoLink = driver.findElement(By.id("mtd_97"));
            vieglieAutoLink.click();

            WebElement minCena = driver.findElement(By.id("f_o_8_min"));
            minCena.sendKeys("6000");

            WebElement maxCena = driver.findElement(By.id("f_o_8_max"));
            maxCena.sendKeys("10000");

            Select minGadsDropDown = new Select(driver.findElement(By.id("f_o_18_min")));
            minGadsDropDown.selectByValue("2001");

            Select maxTilpumsDropDown = new Select(driver.findElement(By.id("f_o_15_max")));
            maxTilpumsDropDown.selectByValue("3.0");

            Select krasaDropDown = new Select(driver.findElement(By.id("f_o_17")));
            krasaDropDown.selectByVisibleText("Balta");  // will not work with another language. Should use another selectBy

            WebElement mekletButton = driver.findElement(By.className("s12"));
            mekletButton.click();

            sleep(3000);

            driver.quit();
        }
}
