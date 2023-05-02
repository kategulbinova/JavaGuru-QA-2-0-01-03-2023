package teacher.testing.aliExpressTestingPOM.tests;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import teacher.testing.aliExpressTestingPOM.pages.HomePage;
import teacher.testing.aliExpressTestingPOM.pages.SearchResultsPage;

public class DefaultSearchValueTest {
    public static void main(String[] args) throws InterruptedException {
        String searchForText = "Tattoo";

        WebDriverManager.chromedriver().setup(); // Prepare browser
        WebDriver driver = new ChromeDriver();
        HomePage homePage = new HomePage(driver);
        SearchResultsPage searchResultsPage = new SearchResultsPage(driver);

        // Step 1: open web site
        driver.get("https://www.aliexpress.com");
        // Step 2: remember default search text
        String defaultSearchText = homePage.getSearchFieldText();
        // Step 3: hit search button without entering any text
        homePage.searchDefault();
        // Step 4: check whether these 2 texts correlates
        System.out.println("Default search text is correct: " + ( searchResultsPage.getBreadcrumbText().contains(defaultSearchText)) );

        driver.quit();
    }
}
