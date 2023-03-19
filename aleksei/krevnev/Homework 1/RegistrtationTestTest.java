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
public class RegistrtationTestTest {
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
  public void registrtationTest() {
    driver.get("https://javaguru.lv/");
    driver.manage().window().setSize(new Dimension(1936, 1056));
    driver.findElement(By.cssSelector(".header-button > .default-button")).click();
    driver.findElement(By.name("form-name")).click();
    driver.findElement(By.name("form-name")).sendKeys("Алексей Кревнев");
    driver.findElement(By.name("form-surname")).click();
    driver.findElement(By.name("form-name")).click();
    driver.findElement(By.name("form-name")).click();
    {
      WebElement element = driver.findElement(By.name("form-name"));
      Actions builder = new Actions(driver);
      builder.doubleClick(element).perform();
    }
    driver.findElement(By.name("form-name")).sendKeys("Алексей ");
    driver.findElement(By.name("form-surname")).click();
    driver.findElement(By.name("form-surname")).sendKeys("Кревнев");
    driver.findElement(By.name("form-email")).click();
    driver.findElement(By.name("form-email")).sendKeys("aleksei.krevnev@gmail.com");
    driver.findElement(By.name("form-phone")).click();
    driver.findElement(By.name("form-phone")).sendKeys("1234568484");
    driver.findElement(By.cssSelector(".default-inner-wrapper")).click();
    driver.findElement(By.name("form-email")).click();
    driver.findElement(By.name("form-email")).click();
    driver.findElement(By.name("form-email")).click();
    {
      WebElement element = driver.findElement(By.name("form-email"));
      Actions builder = new Actions(driver);
      builder.doubleClick(element).perform();
    }
    driver.findElement(By.name("form-email")).sendKeys("dfdg.krevn@gmail.com");
    driver.findElement(By.cssSelector(".submit-button > .default-button")).click();
  }
}
