package natuksa.saucedemo.tests;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class BaseTest {
    WebDriver driver;
    @BeforeMethod
    public void setUp() {
        driver = new ChromeDriver();
        WebDriverManager.chromedriver().setup();
        driver.get("http://www.saucedemo.com");
    }

    @AfterMethod
    public void tearDown() {
        driver.quit();
    }
}