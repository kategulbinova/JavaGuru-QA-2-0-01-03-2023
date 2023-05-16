package irinaver;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.time.Duration;

public class JRoseLoginTest {
    WebDriver driver;
    WebDriverWait wait;
    @BeforeMethod

    public void setUp(){
        driver= new ChromeDriver();
        WebDriverManager.chromedriver().setup();
        wait = new WebDriverWait(driver, Duration.ofSeconds(2));

        driver.get("https://www.janisroze.lv/");
    }
    @Test
    public void loginTest() {

        WebElement userIcon = driver.findElement(By.xpath("//ul[@class='account-dropdown long']"));
        Actions actions = new Actions(driver);
        actions.moveToElement(userIcon).build().perform();

        //Step 1 finding login button;
        WebElement loginBtn = driver.findElement(By.id("header-account"));
        wait.until(ExpectedConditions.elementToBeClickable(loginBtn));
        loginBtn.click();

        //Step 2 sending email;
        WebElement emailField = driver.findElement(By.id("email"));
        emailField.sendKeys("jane.brown@inbox.lv");

        //Step 3 sending password;
        WebElement passwordField = driver.findElement(By.id("pass"));
        passwordField.sendKeys("BookTest23#");

        //Step 4 submitting credentials;
        WebElement submitField = driver.findElement(By.id("send2"));
        submitField.click();
    }

    //information found on the internet "GURU99";
    public void optionalTask(){
        WebElement findFooter = driver.findElement(By.xpath("//div[@class='footer-copyright']"));
        JavascriptExecutor js = (JavascriptExecutor)driver;
        js.executeScript("window.scrollBy(0,800)",findFooter);
    }
    @AfterMethod

    public void tearDown() {
        driver.quit();
    }
  }


