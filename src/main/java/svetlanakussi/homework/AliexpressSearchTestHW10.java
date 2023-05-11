package svetlanakussi.homework;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class AliexpressSearchTestHW10 {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();

        WebDriver driver = new ChromeDriver();

        driver.get("https://www.aliexpress.com/");

        String searchText = "gemstone";

        WebElement searchInput = driver.findElement(By.cssSelector("input.search-key"));
        searchInput.sendKeys(searchText);

        WebElement searchButton = driver.findElement(By.className("search-button"));
        searchButton.click();


        List<WebElement> searchResults = driver.findElements(By.xpath("//img[@aria-hidden='true']"));

        System.out.println("Gemstone search results on Aliexpress : " + searchResults.size());


        driver.quit();
    }
}
