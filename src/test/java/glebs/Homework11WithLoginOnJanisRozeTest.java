package glebs;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.time.Duration;


public class Homework11WithLoginOnJanisRozeTest {
    WebDriver driver;
    WebDriverWait wait;
    Actions actions;
    JavascriptExecutor executor;
    @BeforeTest
    public void setUp(){
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        actions=new Actions(driver);
        wait = new WebDriverWait(driver, Duration.ofSeconds(3));
        executor = (JavascriptExecutor) driver;

        driver.get("https://www.janisroze.lv/");
    }
    @AfterTest
    public void tearDown(){
        driver.quit();
    }

    @Test
    public void Homework11Test(){

        WebElement lietotajaProfilsDDwithDelay= driver.findElement(By.xpath("//ul[@class='account-dropdown long']"));
        actions.moveToElement(lietotajaProfilsDDwithDelay).build().perform();

        WebElement ielogotiesPress=driver.findElement(By.xpath("//a[@title='Ielogoties']"));
        wait.until(ExpectedConditions.elementToBeClickable(ielogotiesPress));
        ielogotiesPress.click();

        WebElement loginField=driver.findElement(By.id("email"));
        loginField.sendKeys("spoke12988@gmail.com");

        WebElement passwordField=driver.findElement(By.id("pass"));
        passwordField.sendKeys("TrewTrewTrew223322!");

        WebElement loginButton=driver.findElement(By.xpath("//button[@id='send2']"));
        loginButton.click();
        wait.until(ExpectedConditions.urlMatches("https://www.janisroze.lv/lv/customer/account/"));

        WebElement bottomPage = driver.findElement(By.xpath("//div[@class='footer-copyright']"));
        executor.executeScript("arguments[0].scrollIntoView();", bottomPage);



    }

}
