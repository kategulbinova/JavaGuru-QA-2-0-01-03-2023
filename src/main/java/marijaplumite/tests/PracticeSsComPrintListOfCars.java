package marijaplumite.tests;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

import static java.lang.Thread.sleep;

public class PracticeSsComPrintListOfCars {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        driver.get("http://ss.lv");

        WebElement vieglieAutoLink = driver.findElement(By.id("mtd_97"));
        vieglieAutoLink.click();

        List<WebElement> vieglieAutoLinks = driver.findElements(By.xpath("//form[@id='filter_frm']/table[2]//a[@class='a_category']"));

        for (WebElement link : vieglieAutoLinks) {
            System.out.println(" -" + link.getText());
        }
        sleep(1000);

        driver.quit();
    }
}
