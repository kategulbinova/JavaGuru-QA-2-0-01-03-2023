package olgaZikova.lesson10;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class PrintListOfCarsTest {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver dr = new ChromeDriver();

        dr.get("http://www.ss.lv/");

        WebElement viegliAutoLink = dr.findElement(By.id("mtd_97"));
        viegliAutoLink.click();

        List <WebElement> viegliAutoLinks = dr.findElements(By.xpath("//form[@id='filter_frm']/table[2]//a[@class='a_category']"));

        System.out.println("Size of my list is " + viegliAutoLinks.size());

        for (WebElement link : viegliAutoLinks) {
            System.out.println("Viegli auto types: " + viegliAutoLinks);
        }



        dr.quit();
    }
}
