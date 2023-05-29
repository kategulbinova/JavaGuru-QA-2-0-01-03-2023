package margo.classWork.tests.lect10FunctionsLocators;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class SSVieglieAutoLinks {

    public static void main(String [] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        driver.get("https://www.ss.com");

        WebElement vieglieAutoLink = driver.findElement(By.id("mtd_97"));
        vieglieAutoLink.click();

        List<WebElement> vieglieAutoLinks = driver.findElements(By.xpath("//form[@id='filter_frm']/table[2]//a[contains(@id,'ahc')]"));
        //short xpath version //form[@id='filter_frm']/table[2]

        for (WebElement link: vieglieAutoLinks) {
            System.out.println(link.getText());

            driver.quit();
        }
    }
}
