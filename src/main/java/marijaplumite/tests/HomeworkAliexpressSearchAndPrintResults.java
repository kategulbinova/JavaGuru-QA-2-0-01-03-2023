package marijaplumite.tests;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class HomeworkAliexpressSearchAndPrintResults {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        driver.get("https://www.aliexpress.com/");

        WebElement searchField = driver.findElement(By.id("search-key"));

        String searchText1 = "iphone case";
        searchField.sendKeys(searchText1);

        WebElement serachButton = driver.findElement(By.className("search-button"));
        serachButton.click();

        List<WebElement> resultLinks = driver.findElements(By.xpath("//div[@class='content--container--2dDeH1y']//a[@class='manhattan--container--1lP57Ag cards--gallery--2o6yJVt']"));

        System.out.println("Size of the List: " + resultLinks.size());

        for (WebElement links : resultLinks) {
            System.out.println("Found link: " + links.getAttribute("href"));
        }

        driver.quit();
    }
}
