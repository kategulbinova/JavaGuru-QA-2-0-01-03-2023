package aleksejs_lukins.tests;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

import static java.lang.Thread.sleep;

public class Lesson10WorkWithListOfElementsTest {

    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        driver.get("https://www.ss.lv");

        WebElement vieglieAutoLink = driver.findElement(By.id("mtd_97"));
        vieglieAutoLink.click();

        List<WebElement> vieglieAutoLinks = driver.findElements(By.xpath("//a[@class='a_category']"));

        System.out.println("Size of list " + vieglieAutoLinks.size());
        for (WebElement link : vieglieAutoLinks) {
            System.out.println(" -" + link.getText());
        }

        sleep(2000);
        driver.quit();
    }

}