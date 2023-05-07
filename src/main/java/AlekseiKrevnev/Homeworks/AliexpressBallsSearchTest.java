package AlekseiKrevnev.Homeworks;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import teacher.testing.aliExpressTestingPOM.pages.HomePage;
import teacher.testing.aliExpressTestingPOM.pages.SearchResultsPage;

import java.util.ArrayList;
import java.util.List;

public class AliexpressBallsSearchTest {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.aliexpress.com/");
        String searchText = "balls";
        WebElement searchBox = driver.findElement(By.name("SearchText"));
        searchBox.sendKeys(searchText);
        searchBox.submit();
        List<WebElement> searchResults = driver.findElements(By.xpath("//a[@class='history-item product ']"));
        List<String> links = new ArrayList<String>();
        for (WebElement result : searchResults) {
            String link = result.getAttribute("href");
            links.add(link);
        }
        System.out.println("Number of links found: " + links.size());
        driver.quit();

    }
}