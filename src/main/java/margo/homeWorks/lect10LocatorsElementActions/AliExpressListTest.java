package margo.homeWorks.lect10LocatorsElementActions;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import java.util.List;

import static java.lang.Thread.sleep;

public class AliExpressListTest {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        driver.get("https://www.aliexpress.com/");

        WebElement searchField = driver.findElement(By.id("search-key"));
        String itemSearched = "ray-ban sunglasses for women";
        searchField.sendKeys(itemSearched);

        WebElement searchButton = driver.findElement(By.className("search-button"));
        searchButton.click();

        //With the below I tried to increase the number of the searched items that is counted & displayed in the end of this code.
        //The thing is, when I search manually using xpath and directly on the site: the first result is 16, but somewhere at item nr.10 the overall result increases
        //and it becomes 32, and so on. In total 60 items.
        //However, when I use the webdriver .findElements and each xpath that I have listed in this code, the result equals to 16
        //It seems that AliExpress provides this data somehow gradually. With the below 2 lines I managed to increase my initial search
        //result up to 32, didn't help a lot, but now I know that I can use JS to scroll till the end of the page.
        JavascriptExecutor jsExecutor = (JavascriptExecutor) driver;
        jsExecutor.executeScript("window.scrollTo(0, document.body.scrollHeight)");

        //below sleep presents here only to give webdriver sufficient time to scroll till the end of the page
        sleep(1500);

        //xpath other options that give similar search result
        //a[contains(@href, 'www.aliexpress.com/item')]
        //a[@class='manhattan--container--1lP57Ag cards--gallery--2o6yJVt search-card-item']

        List<WebElement> searchResult = driver.findElements(By.xpath("//div[@id='card-list']/a[contains(@href,'')]"));
        System.out.println("The number of " + itemSearched + " that are displayed on one page equals to " + searchResult.size());

        driver.quit();
    }
}
