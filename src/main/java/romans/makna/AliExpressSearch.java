package romans.makna;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;


public class AliExpressSearch {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        driver.get("https://www.aliexpress.com/");

        WebElement searchField = driver.findElement(By.xpath("//*[@id=\"search-key\"]"));
        searchField.sendKeys("tattoo ink");

        WebElement searchButton = driver.findElement(By.xpath("//*[@id=\"form-searchbar\"]/div[1]/input"));
        searchButton.click();

        List<WebElement> tattooLinks = driver.findElements(By.xpath("//a[contains(@href, 'www.aliexpress.com/item')]"));

        System.out.println("Size of my list is " + tattooLinks.size());

        driver.quit();
    }
}

