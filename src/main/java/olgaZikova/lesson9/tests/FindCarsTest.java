package olgaZikova.lesson9.tests;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.List;
import java.util.Set;

import static java.lang.Thread.sleep;

public class FindCarsTest {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver dr = new ChromeDriver();

        dr.get("https://www.ss.lv");

        WebElement viegliAutoButton = dr.findElement(By.id("mtd_97"));
        viegliAutoButton.click();

        WebElement priceMin = dr.findElement(By.id("f_o_8_min"));
        priceMin.sendKeys("6000");

        WebElement priceMax = dr.findElement(By.id("f_o_8_max"));
        priceMax.sendKeys("10000");

        Select yearsDD = new Select(dr.findElement(By.id("f_o_18_min")));
        yearsDD.selectByVisibleText("2001");

        Select engineDD = new Select(dr.findElement(By.id("f_o_15_max")));
        engineDD.selectByVisibleText("3.0");

        Select colorDD = new Select(dr.findElement(By.id("f_0_17")));
        colorDD.selectByVisibleText("Balta");

        WebElement mekletButton = dr.findElement(By.className("s12"));
        mekletButton.click();

        sleep (5000);

        dr.quit();

    }
}