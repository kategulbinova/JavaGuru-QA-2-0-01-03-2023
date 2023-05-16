package alex;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import teacher.testing.aliExpressTestingPOM.pages.HomePage;
import teacher.testing.aliExpressTestingPOM.pages.SearchResultsPage;

public class Search {
    public static void main (String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver dr = new ChromeDriver();
        dr.get("https://www.aliexpress.com/w/wholesale-tattoo.html?catId=0&initiative_id=SB_20230505112320&SearchText=tattoo&spm=a2g0o.best.1000002.0");
        System.out.println("list");

dr.quit();

    }
    }
