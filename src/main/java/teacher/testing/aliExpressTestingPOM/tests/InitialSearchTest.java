package teacher.testing.aliExpressTestingPOM.tests;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import teacher.testing.aliExpressTestingPOM.pages.HomePage;
import teacher.testing.aliExpressTestingPOM.pages.SearchResultsPage;

import java.util.List;

public class InitialSearchTest {

    public static void main(String[] args) throws InterruptedException {
        String searchForText = "Tattoo";

        WebDriverManager.chromedriver().setup(); // Prepare browser
        WebDriver driver = new ChromeDriver();
        HomePage homePage = new HomePage(driver);
        SearchResultsPage searchResultsPage = new SearchResultsPage(driver);

        // Step 1: open web page
        driver.get("https://www.aliexpress.com");
        // Step 2: search for some text
        homePage.searchForText(searchForText);
        // Step 3: print results
        System.out.println("I found so many results: " +  searchResultsPage.getNumberOfLinksFound());
        searchResultsPage.printFoundLinks();

        driver.quit();
    }
}
