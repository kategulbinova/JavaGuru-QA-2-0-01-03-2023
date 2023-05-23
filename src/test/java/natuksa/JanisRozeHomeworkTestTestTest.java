package natuksa;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.time.Duration;

    public class JanisRozeHomeworkTestTestTest {
        WebDriver driver;
        WebDriverWait wait;
        JavascriptExecutor js;
        @BeforeTest
        public void setUp() {
            WebDriverManager.chromedriver().setup();
            driver = new ChromeDriver();
            wait = new WebDriverWait(driver, Duration.ofSeconds(2));
            driver.get("https://www.janisroze.lv/");
            js = (JavascriptExecutor) driver;
        }
        @Test
        public void LoginCheck() {
            WebElement lietotajaIkonka = driver.findElement(By.xpath("//ul[@class='account-dropdown long']"));
            Actions actions = new Actions(driver);
            actions.moveToElement(lietotajaIkonka).build().perform();

            WebElement ielogotiesElement = driver.findElement(By.xpath("//li/a[@title='Ielogoties']"));
            wait.until(ExpectedConditions.elementToBeClickable(ielogotiesElement));
            ielogotiesElement.click();

            WebElement loginField = driver.findElement(By.id("email"));
            loginField.sendKeys("akakij@inbox.lv");

            WebElement passwordField = driver.findElement(By.id("pass"));
            passwordField.sendKeys("Akakij9090");

            WebElement submitButton = driver.findElement(By.id("send2"));
            submitButton.click();

            js.executeScript("arguments[0].scrollIntoView(true);", driver.findElement(By.className("footer-container")));
        }
        @AfterTest
        public void tearDown() {
            driver.quit();
        }
    }

