package natuksa.tests;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;


public class JanisRozeActionsTest {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        Actions actions = new Actions(driver);

        driver.get("https://www.janisroze.lv/");

        WebElement lietotajaIkonka = driver.findElement(By.xpath("//ul[@class='account-dropdown long']"));
        actions.moveToElement(lietotajaIkonka).build().perform();


    }
}
