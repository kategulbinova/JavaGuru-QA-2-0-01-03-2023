package natuksa.tests;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class FindElements {
    public static void main (String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        driver.get("https://www.ss.com/lv/");

        WebElement vieglieAutoLink = driver.findElement(By.xpath("//*[@id='mtd_97']"));
        vieglieAutoLink.click();

        List<WebElement> vieglieAutoLinks = driver.findElements(By.xpath("//a[@id]"));

        System.out.println("Size of my list is " + vieglieAutoLinks.size());

        for (WebElement link : vieglieAutoLinks) {
            System.out.println(link.getText());
        }

        driver.quit();
    }
}
// form[@id='filter_frm']/table[2]//h4[@class='category']

