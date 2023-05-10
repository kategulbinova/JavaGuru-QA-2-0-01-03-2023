package Kristiana.homeworkXpath;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

import static java.lang.Thread.sleep;

public class HomeworkXpath10Lesson {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        driver.get("https://www.aliexpress.com/");

        WebElement searchField = driver.findElement(By.id("search-key"));
        String searchText1 = "Stickers";
        searchField.sendKeys(searchText1);

        WebElement serachButton = driver.findElement(By.xpath("//*[@type='submit']"));
        serachButton.click();

        List<WebElement> resultLinks = driver.findElements(By.xpath("//a[@class='manhattan--container--1lP57Ag cards--gallery--2o6yJVt']"));

        System.out.println("Size of the List: " + resultLinks.size());
        sleep(5000);
        for (WebElement links : resultLinks) {
            System.out.println("Found link: " + links.getAttribute("href"));
        }

        driver.quit();
    }
}