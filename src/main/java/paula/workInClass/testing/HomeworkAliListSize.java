package paula.workInClass.testing;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class HomeworkAliListSize {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        org.openqa.selenium.WebDriver driver = new ChromeDriver();

        String searchItem = "iphone case";

        driver.get("https://www.aliexpress.com");

        WebElement searchField = driver.findElement(By.id("search-key"));
        searchField.sendKeys(searchItem);

        WebElement searchButton = driver.findElement(By.className("search-button"));
        searchButton.click();

        List<WebElement> searchResultLinks = driver.findElements(By.xpath("//a[contains(@href, 'www.aliexpress.com/item')]"));
        System.out.println("Number of resulted links: " + searchResultLinks.size());

        driver.quit();
    }
}