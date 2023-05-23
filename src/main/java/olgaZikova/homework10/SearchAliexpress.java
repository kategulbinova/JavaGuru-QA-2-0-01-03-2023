package olgaZikova.homework10;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class SearchAliexpress {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver dr = new ChromeDriver();
        String searchItem = "tattoo";

        dr.get("https://www.aliexpress.com");

        WebElement searchField = dr.findElement(By.id("search-key"));
        searchField.sendKeys(searchItem);

        WebElement searchButton = dr.findElement(By.className("search-button"));
        searchButton.click();

        List<WebElement> searchResults = dr.findElements(By.xpath("//a[contains(@href, 'www.aliexpress.com/item')]"));

        for (WebElement links : searchResults) {
            System.out.println(links.getAttribute("href"));
        }
        System.out.println("Arrays size is " + searchResults.size());

        dr.quit();
    }
}
