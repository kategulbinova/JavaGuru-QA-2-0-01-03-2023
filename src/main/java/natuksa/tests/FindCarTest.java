package natuksa.tests;

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

        driver.get("https://www.ss.lv/lv");

        WebElement vieglieAuto = driver.findElement(By.id("mtd_97"));
        vieglieAuto.click();

        WebElement cena = driver.findElement(By.id("f_o_8_min"));
        cena.sendKeys("6000");

        WebElement cenaMax = driver.findElement(By.id("f_o_8_max"));
        cenaMax.sendKeys("10000");

        Select gads = new Select(driver.findElement(By.id("f_o_18_min")));
        gads.selectByVisibleText("2001");

        Select tilp = new Select(driver.findElement(By.id("f_o_15_max")));
        tilp.selectByVisibleText("3.0");

        Select color = new Select(driver.findElement(By.id("f_o_17")));
        color.selectByVisibleText("Balta");


        WebElement meklet = driver.findElement(By.className("s12"));
        meklet.click();

        sleep(5000);
        driver.quit();
    }
}
