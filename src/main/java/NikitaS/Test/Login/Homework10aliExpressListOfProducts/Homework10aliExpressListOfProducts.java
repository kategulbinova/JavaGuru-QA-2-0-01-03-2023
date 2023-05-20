package NikitaS.Test.Login.Homework10aliExpressListOfProducts;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

import static java.lang.Thread.sleep;

public class Homework10aliExpressListOfProducts {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        org.openqa.selenium.WebDriver driver = new ChromeDriver();

        driver.get("https://www.aliexpress.com/");

        String searchText = "Bugatti La Voiture Noire";

        WebElement searchField = driver.findElement(By.id("search-key"));
        searchField.sendKeys(searchText);

        WebElement searchButton = driver.findElement(By.xpath("//form//input[@class='search-button']"));
        searchButton.click();

        List<WebElement> searchResultLinks = driver.findElements(By.xpath("//a[@class='manhattan--container--1lP57Ag cards--gallery--2o6yJVt']"));
        System.out.println("The size of search result links is: " + searchResultLinks.size());

        for (WebElement link : searchResultLinks) {
            System.out.println(link.getAttribute("href"));
        }

        //sleep(5000);


        driver.quit();
    }
}


