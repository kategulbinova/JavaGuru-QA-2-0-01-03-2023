package margo.classWork.tests;

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

        driver.get("https://www.ss.com/en/");

        WebElement carsLink = driver.findElement(By.id("mtd_97"));
        carsLink.click();

        WebElement priceFromField = driver.findElement(By.id("f_o_8_min"));
        priceFromField.sendKeys("6000");

        WebElement priceToField = driver.findElement(By.id("f_o_8_max"));
        priceToField.sendKeys("10000");

        Select yearFromDropDown = new Select (driver.findElement(By.id("f_o_18_min")));
        yearFromDropDown.selectByValue("2001");

        Select volumeMaxDropDown = new Select (driver.findElement(By.id("f_o_15_max")));
        volumeMaxDropDown.selectByValue("3.0");

        Select colorDropDown = new Select (driver.findElement(By.id("f_o_17")));
        colorDropDown.selectByValue("6318");

        sleep(5000);

        driver.quit();
    }
}
