package germans;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
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

public class JanisRozeHomeworkTest {
    WebDriver driver;
    WebDriverWait wait;
    @BeforeTest
    public void setUp() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        wait = new WebDriverWait(driver, Duration.ofSeconds(2));
        driver.get("https://www.janisroze.lv/");
    }
    @Test
    public void LoginTest() {
        WebElement userIcon = driver.findElement(By.xpath("//ul[@class='account-dropdown long']"));
        Actions actions = new Actions(driver);
        actions.moveToElement(userIcon).build().perform();

        WebElement logInElement = driver.findElement(By.xpath("//li/a[@title='Ielogoties']"));
        wait.until(ExpectedConditions.elementToBeClickable(logInElement));
        logInElement.click();

        WebElement loginField = driver.findElement(By.id("email"));
        loginField.sendKeys("testgerman@inbox.lv");

        WebElement passwordField = driver.findElement(By.id("pass"));
        passwordField.sendKeys("Test1234");

        WebElement submitButton = driver.findElement(By.id("send2"));
        submitButton.click();

    }
    @AfterTest
    public void quitDriver() {
        driver.quit();
    }
}

