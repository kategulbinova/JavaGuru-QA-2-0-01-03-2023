package lpudnika.lessons.lesson11;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import static java.lang.Thread.sleep;

public class JanisRozeMouseHoverTest {

    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        driver.get("https://www.janisroze.lv/");

        WebElement userIcon = driver.findElement(By.xpath("//*[@id='header-account']/ul/li/a/span[1]"));

        Actions actions = new Actions(driver);
        actions.moveToElement(userIcon).build().perform();

        sleep(2000);

        userIcon.click();

        driver.quit();
    }
}
