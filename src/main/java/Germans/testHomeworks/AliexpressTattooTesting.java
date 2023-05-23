package germans.testHomeworks;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

import static java.lang.Thread.sleep;

public class AliexpressTattooTesting {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.aliexpress.com/");

        WebElement searchField = driver.findElement(By.id("search-key"));
        searchField.sendKeys("ketellbell 16kg");

        WebElement searchButton = driver.findElement(By.className("search-button"));
        searchButton.click();

        List<WebElement> listOfKetellbels = driver.findElements(By.xpath("//a[contains(@href, 'www.aliexpress.com/item')]"));
        System.out.println("There are " + listOfKetellbels.size() + " links of ketellbells");

        for (WebElement links : listOfKetellbels) {
            System.out.println(links.getAttribute("href"));
        }

        sleep(3000);
        driver.quit();

    }
}
