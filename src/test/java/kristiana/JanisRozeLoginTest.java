package kristiana;

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


public class JanisRozeLoginTest {

    WebDriver driver;
    WebDriverWait wait;
    JavascriptExecutor js;


    @BeforeTest
    public void setUp() {

        driver = new ChromeDriver();
        WebDriverManager.chromedriver().setup();
        wait = new WebDriverWait(driver, Duration.ofSeconds(3));
        js = (JavascriptExecutor) driver;


        driver.get("https://www.janisroze.lv/");

    }

    @Test
    public void loginTest ()  {
        WebElement element = driver.findElement(By.xpath("//a[@class='link']"));

        Actions actions = new Actions(driver);
        actions.moveToElement(element).build().perform();

        WebElement loginOption = driver.findElement(By.xpath("//a[contains(text(), 'Ielogoties')]"));
        wait.until(ExpectedConditions.elementToBeClickable(loginOption));
        loginOption.click();

        WebElement loginField = driver.findElement(By.id("email"));
        loginField.sendKeys("kristiana.mjodova@gmail.com");

        WebElement passwordField = driver.findElement(By.id("pass"));
        passwordField.sendKeys(("kristiana123"));

        WebElement loginButton = driver.findElement(By.id("send2"));
        loginButton.click();

        WebElement Element = driver.findElement(By.xpath("//div[@class='footer-copyright']"));
        js.executeScript("arguments[0].scrollIntoView();", Element);



    }

    @AfterTest
    public void tearDown () {
        driver.quit();

    }

}
