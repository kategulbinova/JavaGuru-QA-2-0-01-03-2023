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
public class GoogleJGTest {
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
  public void googleJG() {
    // Test name: Google_JG
    // Step # | name | target | value
    // 1 | open | https://www.google.lv/ | 
    driver.get("https://www.google.lv/");
    // 2 | setWindowSize | 1520x808 | 
    driver.manage().window().setSize(new Dimension(1520, 808));
    // 3 | click | name=q | 
    driver.findElement(By.name("q")).click();
    // 4 | type | name=q | java gu
    driver.findElement(By.name("q")).sendKeys("java gu");
    // 5 | click | css=#jZ2SBf > .wM6W7d > span | 
    driver.findElement(By.cssSelector("#jZ2SBf > .wM6W7d > span")).click();
    // 6 | click | css=.tF2Cxc > .yuRUbf .LC20lb | 
    driver.findElement(By.cssSelector(".tF2Cxc > .yuRUbf .LC20lb")).click();
    // 7 | click | css=.menu li:nth-child(1) > a | 
    driver.findElement(By.cssSelector(".menu li:nth-child(1) > a")).click();
    // 8 | click | css=.single-list:nth-child(1) .single-course:nth-child(1) .default-button | 
    driver.findElement(By.cssSelector(".single-list:nth-child(1) .single-course:nth-child(1) .default-button")).click();
    // 9 | click | css=.payment-button > .default-button | 
    driver.findElement(By.cssSelector(".payment-button > .default-button")).click();
    // 10 | click | name=form-name | 
    driver.findElement(By.name("form-name")).click();
    // 11 | type | name=form-name | vn
    driver.findElement(By.name("form-name")).sendKeys("vn");
    // 12 | click | name=form-phone | 
    driver.findElement(By.name("form-phone")).click();
    // 13 | type | name=form-phone | vcn
    driver.findElement(By.name("form-phone")).sendKeys("vcn");
    // 14 | click | name=form-email | 
    driver.findElement(By.name("form-email")).click();
    // 15 | type | name=form-email | vcn
    driver.findElement(By.name("form-email")).sendKeys("vcn");
    // 16 | click | css=.label | 
    driver.findElement(By.cssSelector(".label")).click();
    // 17 | click | css=.last | 
    driver.findElement(By.cssSelector(".last")).click();
    // 18 | click | css=.checkbox-mark | 
    driver.findElement(By.cssSelector(".checkbox-mark")).click();
    // 19 | click | css=.default-button-submit | 
    driver.findElement(By.cssSelector(".default-button-submit")).click();
  }
}