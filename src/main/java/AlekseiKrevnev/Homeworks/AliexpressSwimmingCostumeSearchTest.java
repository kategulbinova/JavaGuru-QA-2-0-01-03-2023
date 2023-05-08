package AlekseiKrevnev.Homeworks;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class AliexpressSwimmingCostumeSearchTest {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();

        WebDriver driver = new ChromeDriver();

        driver.get("https://www.aliexpress.com/");

        WebElement searchField = driver.findElement(By.id("search-key"));

        String searchText1 = "Kids swimming costumes";

        searchField.sendKeys(searchText1);

        WebElement searchButton = driver.findElement(By.className("search-button"));

        searchButton.click();

        List<WebElement> resultLinks = driver.findElements(By.xpath("//div[@class='content--container--2dDeH1y']//a[@class='manhattan--container--1lP57Ag cards--gallery--2o6yJVt']"));

        System.out.println("Number of the items in the list -  " + resultLinks.size());

        driver.quit();
    }
}