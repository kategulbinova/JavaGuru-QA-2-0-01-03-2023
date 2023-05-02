package olgaZikova.lesson9.tests;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import static java.lang.Thread.sleep;

public class FindDogsTest {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup(); // setup driver
        WebDriver dr = new ChromeDriver(); //create object

        dr.get("https://www.ss.lv"); // open URL

        WebElement dogLink = dr.findElement(By.id("mtd_300")); //find elements
        dogLink.click();

        WebElement ageFieldMin = dr.findElement(By.id("f_o_1276_min"));
        ageFieldMin.sendKeys("1");

        WebElement ageFieldMax = dr.findElement(By.id("f_o_1276_max"));
        ageFieldMax.sendKeys("1");

        WebElement mekletButton = dr.findElement(By.className("s12"));
        mekletButton.click();

        sleep (5000);

        dr.quit();
    }
}
