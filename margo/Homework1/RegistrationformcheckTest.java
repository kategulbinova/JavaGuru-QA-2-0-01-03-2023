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
public class RegistrationformcheckTest {
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
  public void registrationformcheck() {
    driver.get("https://www.google.com/search?q=javaguru.lv&sxsrf=APwXEdcvnstOS_gztjYYHp68KhenYL20vw%3A1681632654023&source=hp&ei=ja07ZI_UO_qOxc8PuvKN8Aw&iflsig=AOEireoAAAAAZDu7nnz98AWgq32pEOSDcFf67nc0iG_a&oq=java&gs_lcp=Cgdnd3Mtd2l6EAMYADIECCMQJzIECCMQJzIECCMQJzIICAAQigUQkQIyCAgAEIoFEJECMgcIABCKBRBDMgUIABCABDIFCAAQgAQyBQgAEIAEMgUILhCABDoLCC4QgAQQxwEQ0QM6CwguEIAEEMcBEK8BOg4ILhCABBDHARCvARDUAjoHCC4QgAQQCjoHCAAQgAQQClAAWIcDYJwRaABwAHgAgAFGiAHZAZIBATSYAQCgAQE&sclient=gws-wiz");
    driver.manage().window().setSize(new Dimension(2000, 1000));
    driver.findElement(By.cssSelector(".tF2Cxc > .yuRUbf .LC20lb")).click();
    driver.findElement(By.linkText("LV")).click();
    driver.findElement(By.cssSelector(".menu li:nth-child(1) > a")).click();
    driver.findElement(By.linkText("QA")).click();
    driver.findElement(By.cssSelector(".single-course:nth-child(2) .course-image img")).click();
    driver.findElement(By.name("form-name")).click();
    driver.findElement(By.name("form-name")).sendKeys("22");
    driver.findElement(By.name("form-phone")).click();
    driver.findElement(By.name("form-phone")).sendKeys("33");
    driver.findElement(By.name("form-email")).click();
    driver.findElement(By.name("form-email")).sendKeys("44");
    driver.findElement(By.cssSelector(".label")).click();
    driver.findElement(By.cssSelector(".last")).click();
    driver.findElement(By.cssSelector(".checkbox-mark > img")).click();
    driver.findElement(By.cssSelector(".default-button-submit")).click();
  }
}
