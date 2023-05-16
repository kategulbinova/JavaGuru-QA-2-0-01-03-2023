package aleksejKrevnev;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.interactions.Actions;
import java.time.Duration;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;

public class janisRozeLoginTest {
    WebDriver driver;
    WebDriverWait wait;
    @BeforeMethod
    public void setUp() {
        driver = new ChromeDriver();
        WebDriverManager.chromedriver().setup();
        wait = new WebDriverWait(driver, Duration.ofSeconds(3));
        driver.get("https://www.janisroze.lv/");
    }
    @Test
    public void janisRozeLoginTest(){

        WebElement lietProfItem = driver.findElement(By.xpath("//ul[@class='account-dropdown long']"));

        Actions actions = new Actions(driver);
        actions.moveToElement(lietProfItem).build().perform();


        WebElement ielogotiesItem = driver.findElement(By.xpath("//a[contains(text(), 'Ielogoties')]"));
        wait.until(ExpectedConditions.elementToBeClickable(ielogotiesItem));
        ielogotiesItem.click();

        WebElement epastaAdrFld = driver.findElement(By.id("email"));
        epastaAdrFld.sendKeys("aleksei.krevnev@gmail.com");

        WebElement paroleFld = driver.findElement(By.id("pass"));
        paroleFld.sendKeys("123456789");

        WebElement ielogotiesBtn = driver.findElement(By.id("send2"));
        ielogotiesBtn.click();
    }


    @AfterMethod
    public void quit(){
        driver.quit();
    }
}
