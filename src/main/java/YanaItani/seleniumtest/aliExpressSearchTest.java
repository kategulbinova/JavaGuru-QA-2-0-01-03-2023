package YanaItani.seleniumtest;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

import static java.lang.Thread.sleep;

public class aliExpressSearchTest {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver dr = new ChromeDriver();
        dr.get("https://www.aliexpress.com/");
        String search = "iphone";
        WebElement searchInputField = dr.findElement(By.id("search-key"));
        searchInputField.sendKeys(search);
        WebElement searchButton = dr.findElement(By.xpath("//input[@class='search-button']"));
        searchButton.click();
        sleep(5000);


        List<WebElement> searchResult = dr.findElements (By.xpath("//a[@class='manhattan--container--1lP57Ag cards--gallery--2o6yJVt']"));
        System.out.println("searchResult are: "+searchResult.size());

        for (WebElement link : searchResult) {
            System.out.println(" -" + link.getAttribute("href"));
        }
        sleep(5000);

        dr.quit();

    }
}
