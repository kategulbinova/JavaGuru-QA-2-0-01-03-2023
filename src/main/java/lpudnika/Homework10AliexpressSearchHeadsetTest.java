package lpudnika;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

import static java.lang.Thread.sleep;

public class Homework10AliexpressSearchHeadsetTest{

    public static void main(String[] args) throws InterruptedException{
        //setup of driver
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        //open webpage
        driver.get("https://www.aliexpress.com/");

        //search for "headset"
        String searchValue = "headset";
        WebElement searchField = driver.findElement(By.id("search-key"));
        searchField.sendKeys(searchValue);
        searchField.submit();

        //second option to submit search, is to find field by class name
        // WebElement searchButton= driver.findElement(By.className("search-button"));
        // searchButton.click();

        //wait till all is loaded
        sleep(5000);

        //getting list of elements
        List<WebElement> searchResultLinks = driver.findElements(By.xpath("//a[@class='manhattan--container--1lP57Ag cards--gallery--2o6yJVt']"));

        //print all links
        for (WebElement link : searchResultLinks) {
            System.out.println(link.getAttribute("href"));
        }

        //print the number of founded links
        System.out.println("Number of founded links: " + searchResultLinks.size());

        //close the driver
        driver.quit();
    }
}
