package aleksejs_lukins.Homework10AliexpressSearchResults;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class Homework10AliexpressSearchResultsTest {

    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        String currentSearch = "silver";

        driver.get("https://www.aliexpress.com/");

        WebElement searchField = driver.findElement(By.id("search-key"));
        searchField.sendKeys(currentSearch);

        WebElement searchButton = driver.findElement(By.xpath("//*[@type='submit']"));
        searchButton.click();

        List<WebElement> aliexpressSearchResults = driver.findElements(By.xpath("//a[@class='manhattan--container--1lP57Ag cards--gallery--2o6yJVt']"));
        System.out.println("Size of list " + aliexpressSearchResults.size());

        driver.quit();
    }

}