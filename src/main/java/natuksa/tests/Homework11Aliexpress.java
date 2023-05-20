package natuksa.tests;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;

public class Homework11Aliexpress {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        driver.get("https://www.aliexpress.com/");

        WebElement searchField = driver.findElement(By.id("search-key"));
        searchField.sendKeys("gothic necklace");

        WebElement searchButton = driver.findElement(By.className("search-button"));
        searchButton.click();

        List<WebElement> necklaceLinks = driver.findElements(By.xpath("//a[contains(@href, 'www.aliexpress.com/item')]"));
        System.out.println("Size of my list is " + necklaceLinks.size());

        for (WebElement links : necklaceLinks) {
            System.out.println(links.getAttribute("href"));
        }


        driver.quit();

    }
}