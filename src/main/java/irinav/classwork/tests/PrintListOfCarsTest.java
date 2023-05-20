package irinav.classwork.tests;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

import static java.lang.Thread.sleep;

public class PrintListOfCarsTest {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        driver.get("http://ss.lv");
        WebElement vieglieAutoLink = driver.findElement(By.id("mtd_97"));
        vieglieAutoLink.click();

        List<WebElement> vieglieAutoLinks = driver.findElements(By.xpath("//form[@id ='filter_frm']/table[2]//a[@class='a_category']"));
        System.out.println("Size of my list is: " + vieglieAutoLinks.size());
        for(WebElement link : vieglieAutoLinks){
            System.out.println(" -" + link.getText());
        }
        sleep(5000);
        driver.quit();
    }
}
