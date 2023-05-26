package kristiana.lesson11;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import static java.lang.Thread.sleep;

public class JanisRozeTest {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        org.openqa.selenium.WebDriver driver = new ChromeDriver();

        driver.get("http://www.janisroze.lv");

        WebElement element = driver.findElement(By.xpath("//a[@class='link']"));

        Actions actions = new Actions(driver);
        actions.moveToElement(element).build().perform();

        sleep(2000);

        driver.close();


    }

}
