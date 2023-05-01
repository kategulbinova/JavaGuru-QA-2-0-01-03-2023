package NikitaS.Test.Login;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import static java.lang.Thread.sleep;

public class FindWhiteCar {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver dr = new ChromeDriver();

        dr.get("https://www.ss.com/lv/");

        WebElement vieglieAuto = dr.findElement(By.id("mtd_97"));
        vieglieAuto.click();

        WebElement priceFrom = dr.findElement(By.id("f_o_8_min"));
        priceFrom.sendKeys("6000");

        WebElement priceTo = dr.findElement(By.id("f_o_8_max"));
        priceTo.sendKeys("10000");

        Select yearsFrom = new Select(dr.findElement(By.id("f_o_18_min")));
        yearsFrom.selectByValue("2001");

        Select engineTo = new Select(dr.findElement(By.id("f_o_15_max")));
        engineTo.selectByValue("3.0");

        Select colors = new Select(dr.findElement(By.id("f_o_17")));
        colors.selectByValue("6318");

        WebElement meklet = dr.findElement(By.className("s12"));
        meklet.click();

        sleep(5000);

        dr.quit();

    }
}