// Generated by Selenium IDE
import org.junit.Test;
import org.junit.Before;
import org.junit.After;
import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.core.IsNot.not;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Alert;
import org.openqa.selenium.Keys;
import java.util.*;
import java.net.MalformedURLException;
import java.net.URL;
public class CheckRegistrationTest {
  private WebDriver driver;
  private Map<String, Object> vars;
  JavascriptExecutor js;
  @Before
  public void setUp() {
    driver = new ChromeDriver();
    js = (JavascriptExecutor) driver;
    vars = new HashMap<String, Object>();
  }
  @After
  public void tearDown() {
    driver.quit();
  }
  @Test
  public void checkRegistration() {
    driver.get("https://google.lv/");
    driver.manage().window().setSize(new Dimension(834, 816));
    driver.findElement(By.name("q")).click();
    driver.findElement(By.name("q")).sendKeys("JavaGuru");
    driver.findElement(By.name("q")).sendKeys(Keys.ENTER);
    driver.findElement(By.cssSelector("div:nth-child(2) > .tF2Cxc > .yuRUbf .LC20lb")).click();
    driver.findElement(By.linkText("LV")).click();
    {
      WebElement element = driver.findElement(By.cssSelector(".mobile-header-wrapper > .main-container"));
      Actions builder = new Actions(driver);
      builder.moveToElement(element).clickAndHold().perform();
    }
    {
      WebElement element = driver.findElement(By.cssSelector(".mobile-header-wrapper > .main-container"));
      Actions builder = new Actions(driver);
      builder.moveToElement(element).perform();
    }
    {
      WebElement element = driver.findElement(By.cssSelector(".mobile-header-wrapper > .main-container"));
      Actions builder = new Actions(driver);
      builder.moveToElement(element).release().perform();
    }
    driver.findElement(By.cssSelector(".mobile-header-wrapper > .main-container")).click();
    driver.findElement(By.cssSelector(".wrapper")).click();
    driver.findElement(By.linkText("Kursi")).click();
    driver.findElement(By.cssSelector(".single-course:nth-child(3) .default-button")).click();
    driver.findElement(By.name("form-name")).click();
    driver.findElement(By.name("form-name")).sendKeys("Li Lu");
    driver.findElement(By.name("form-phone")).click();
    driver.findElement(By.name("form-phone")).sendKeys("23789");
    driver.findElement(By.cssSelector(".selectric:nth-child(2)")).click();
    driver.findElement(By.cssSelector(".last")).click();
    driver.findElement(By.cssSelector(".default-button-submit")).click();
  }
}
