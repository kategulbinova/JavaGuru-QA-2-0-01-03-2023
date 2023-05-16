package teacher.testing;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

import static java.lang.Thread.sleep;

public class OpenUserMenuTest {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver dr = new ChromeDriver();

        dr.get("http://www.janisroze.lv");

        WebElement userIcon = dr.findElement(By.xpath("//ul[@class='account-dropdown long']"));

        Actions action = new Actions(dr);
        action.moveToElement(userIcon).build().perform();

        sleep(2000);

        dr.close();
    }
}
