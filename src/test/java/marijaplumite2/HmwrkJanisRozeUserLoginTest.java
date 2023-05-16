package marijaplumite2;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.time.Duration;

public class HmwrkJanisRozeUserLoginTest {
    WebDriver driver;

    WebDriverWait wait;
    @BeforeMethod
    public void setUp() {
       driver = new ChromeDriver();
       WebDriverManager.chromedriver().setup();

       wait = new WebDriverWait(driver, Duration.ofSeconds(5));

       driver.get("https://www.janisroze.lv/");

    }

    @Test
    public void janisRozeLoginTest(){

        WebElement lietotajaProfilsItem = driver.findElement(By.xpath("//ul[@class='account-dropdown long']"));

        Actions actions = new Actions(driver);
        actions.moveToElement(lietotajaProfilsItem).build().perform();


        WebElement ielogotiesItem = driver.findElement(By.xpath("//a[contains(text(), 'Ielogoties')]"));
        wait.until(ExpectedConditions.elementToBeClickable(ielogotiesItem));
        ielogotiesItem.click();

        WebElement epastaAdrField = driver.findElement(By.id("email"));
        epastaAdrField.sendKeys("dfgf@mail.lv");

        WebElement paroleField = driver.findElement(By.id("pass"));
        paroleField.sendKeys("HettyHettyWood2");

        WebElement ielogotiesButton = driver.findElement(By.id("send2"));
        ielogotiesButton.click();

    }
    @Test
    public void optionalTaskJsScrollTest(){

        WebElement footerCopyright = driver.findElement(By.xpath("//div[@class='footer-copyright']"));

        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].scrollIntoView();", footerCopyright);
    }
    @AfterMethod
    public void quit(){
        driver.quit();
    }
}
