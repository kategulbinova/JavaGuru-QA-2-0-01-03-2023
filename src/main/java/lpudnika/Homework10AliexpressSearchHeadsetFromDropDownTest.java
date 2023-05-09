package lpudnika;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

import static java.lang.Thread.sleep;

public class Homework10AliexpressSearchHeadsetFromDropDownTest {

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

        sleep(1000);

        //select the second option from the dropdown list
        WebElement dropdown2 = driver.findElement(By.xpath("//*[@id='form-searchbar']/div[3]/ul/li[2]"));
        dropdown2.click();

        //wait till all is loaded
        sleep(2500);

        //scroll down the page
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,2000)", "");

        sleep(2500);

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
