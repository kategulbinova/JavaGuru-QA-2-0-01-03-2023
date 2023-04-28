package irinav.classwork.tests;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import static java.lang.Thread.sleep;

public class CarTest {
    public static void main(String[] args) throws InterruptedException{
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        driver.get("http://www.ss.lv");

        WebElement vieglieAuto = driver.findElement(By.id("mtd_97"));
        vieglieAuto.click();

        WebElement  cenaNo = driver.findElement(By.id("f_o_8_min"));
        cenaNo.sendKeys("6000");

        WebElement  cenaLidz = driver.findElement(By.id("f_o_8_max"));
        cenaLidz.sendKeys("10000");

        Select gadsNoDropDown = new Select(driver.findElement(By.id("f_o_18_min")));
        gadsNoDropDown.selectByValue("2001");

        Select jaudaMaxDropDown = new Select(driver.findElement(By.id("f_o_15_max")));
        jaudaMaxDropDown.selectByValue("3.0");

        sleep(5000);
        driver.quit();
    }
}
