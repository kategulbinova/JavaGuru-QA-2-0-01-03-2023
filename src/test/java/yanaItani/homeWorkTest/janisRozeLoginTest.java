package yanaItani.homeWorkTest;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.time.Duration;

import static java.lang.Thread.sleep;

public class janisRozeLoginTest {

    WebDriver driver;
    WebDriverWait wait;

    @BeforeMethod
    public void setUp() {
        driver = new ChromeDriver();
        WebDriverManager.chromedriver().setup();
        driver.get("https://www.janisroze.lv/");
        wait = new WebDriverWait(driver, Duration.ofSeconds(5));
    }

        @Test
        public void loginPage() {

            
            Actions actions = new Actions (driver);
            WebElement profile = driver.findElement(By.xpath("//ul[@class='account-dropdown long']"));
            actions.moveToElement(profile).build().perform();
            WebElement loginButton = driver.findElement(By.xpath("//a[@title='Ielogoties']"));
            loginButton.click();
            WebElement emailField = driver.findElement(By.id("email"));
            emailField.sendKeys("yana.itani@gmail.com");
            WebElement password = driver.findElement(By.id("pass"));
            password.sendKeys("69Snowdrops'");
            WebElement lelogoties = driver.findElement(By.id("send2"));
            lelogoties.submit();

            if (driver.getCurrentUrl().contains("customer/account")) {
                System.out.println("Welcome!");
            }else {
                System.out.println("Password or username is incorrect, logihn failed");

            }


            }
    @Test
    public void scrollToFooter() {
        WebDriver driver = new ChromeDriver();
        JavascriptExecutor js = (JavascriptExecutor)driver;
        driver.get("https://www.janisroze.lv/");
        WebElement footer =driver.findElement(By.xpath("//div[@class='footer-copyright']"));
        js.executeScript("arguments[0].scrollIntoView();", footer);


    }
    @AfterMethod
    public void tearDown() {
        driver.quit();
    }
        }

