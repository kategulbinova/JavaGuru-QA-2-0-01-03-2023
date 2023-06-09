package romans.makna;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.ArrayList;
import java.util.List;

public class AliExpressSearch {
    public static void main(String[] args) {
        // Set the path to the ChromeDriver executable
        System.setProperty("webdriver.chrome.driver", "path/to/chromedriver");

        // Create a new instance of ChromeDriver
        WebDriver driver = new ChromeDriver();

        // Navigate to AliExpress website
        driver.get("https://www.aliexpress.com/");

        // Search for the keyword "tattoo"
        String searchKeyword = "tattoo";
        WebElement searchInput = driver.findElement(By.xpath("//input[@id='search-key']"));
        searchInput.sendKeys(searchKeyword);
        searchInput.submit();

        // Find all the resulting links
        List<WebElement> linkElements = driver.findElements(By.xpath("//a[@class='item-title']"));

        // Save all the links into a List
        List<String> links = new ArrayList<>();
        for (WebElement linkElement : linkElements) {
            links.add(linkElement.getAttribute("href"));
        }

        // Print out the size of the List
        System.out.println("Number of links: " + links.size());

        // Print out all the links
        System.out.println("Links:");
        for (String link : links) {
            System.out.println(link);
        }

        // Quit the driver
        driver.quit();
    }
}
