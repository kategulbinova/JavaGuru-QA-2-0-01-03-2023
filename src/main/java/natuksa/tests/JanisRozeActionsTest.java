package natuksa.tests;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import static java.lang.Thread.sleep;

public class JanisRozeActionsTest {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        driver.get("https://www.janisroze.lv/");

        WebElement lietotajaProfilsItem = driver.findElement(By.xpath("//ul[@class='account-dropdown long']"));


        Actions actions = new Actions(driver);
        actions.moveToElement(lietotajaProfilsItem).build().perform();

        sleep(2000);

        driver.quit();

    }
}
