package YanaItani.seleniumtest;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import static java.lang.Thread.sleep;

public class janisrozeTest {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver dr = new ChromeDriver();
        dr.get("https://www.janisroze.lv/");
        Actions actions = new Actions (dr);
        WebElement profile = dr.findElement(By.xpath("//ul[@class='account-dropdown long']"));
        actions.moveToElement(profile).build().perform();
        sleep(2000);
        dr.quit();






    }
}
