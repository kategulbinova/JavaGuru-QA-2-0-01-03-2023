package svetlanaKussi;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
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

public class JanaRozeTestHW {
    WebDriver driver;


    @BeforeMethod
    public void setup() {
        driver = new ChromeDriver();
        WebDriverManager.chromedriver().setup();


        driver.get("https://www.janisroze.lv/");
    }

    @Test
    public void loginTest() {

        WebElement userProfileIcon = driver.findElement(By.xpath("//ul[@class='account-dropdown long']"));
        Actions actions = new Actions(driver);
        actions.moveToElement(userProfileIcon).perform();

        WebElement loginLink = driver.findElement(By.xpath("//a[@href='https://www.janisroze.lv/lv/customer/account/']"));
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
        wait.until(ExpectedConditions.elementToBeClickable(loginLink));
        loginLink.click();


        WebElement usernameInput = driver.findElement(By.id("email"));
        usernameInput.sendKeys("svetlanakaceba@gmail.com");

        WebElement passwordInput = driver.findElement(By.id("pass"));
        passwordInput.sendKeys("qwerty12345");

        WebElement loginButton = driver.findElement(By.xpath("//button[@type='submit']"));
        loginButton.click();

    }
    @AfterMethod
    public void tearDown() {
        driver.quit();
    }

}






