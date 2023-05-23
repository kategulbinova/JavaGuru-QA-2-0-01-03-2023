package marijaplumite2.classworks.saucedemo.tests;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import java.time.Duration;


public class BaseTest {
    WebDriver driver;

    WebDriverWait wait;
    @BeforeMethod
    public void setUp() {
        driver = new ChromeDriver();
        WebDriverManager.chromedriver().setup();

        wait = new WebDriverWait(driver, Duration.ofSeconds(2));

        driver.get("https://www.saucedemo.com/");

    }

    @AfterMethod
    public void cleanUp(){
        driver.quit();
    }
}
