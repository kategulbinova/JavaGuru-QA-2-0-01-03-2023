package romansmakna.homework10.tests;


import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeMethod;

import java.time.Duration;

public class BaseTest {

        WebDriver driver;
        WebDriverWait wait;

        @BeforeMethod
        public void setUp() {
            driver = new ChromeDriver();
            WebDriverManager.chromedriver().setup();

            wait = new WebDriverWait(driver, Duration.ofSeconds(3));

            driver.get("http://www.saucedemo.com");
        }

        @org.testng.annotations.AfterMethod
        public void tearDown() {
            driver.quit();
        }
    }
