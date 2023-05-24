package irinaver.classwork.sauceDemoTests;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;

public class BaseTest {
    WebDriver driver;
    @BeforeMethod
    public void setUp(){

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.saucedemo.com");
    }
    @AfterMethod
    public void tearDown(){
        driver.quit();
    }

    @BeforeSuite
   public void runBeforeWholeSuite() {
       System.out.println("Let's start!");
    }
}