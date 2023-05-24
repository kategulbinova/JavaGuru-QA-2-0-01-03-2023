package nikita;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

import static java.lang.Thread.sleep;
public class Homework11JanisRozeTestLogIn {

    WebDriver driver;
    WebDriverWait waitLoginBtn;
    WebDriverWait waitLoginField;


    @BeforeMethod
    public void setUp() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();

        waitLoginBtn = new WebDriverWait(driver, Duration.ofSeconds(2));

        waitLoginField = new WebDriverWait(driver, Duration.ofSeconds(2));

        driver.get("https://www.janisroze.lv/");
    }

    @Test
    public void JanisRozeTest() throws InterruptedException {

        String username = "asdx@asdx.com";
        String password = "Java_test1%";

        //Step 1: Hover mouse over User Profile Icon
        Actions actions = new Actions(driver);
        WebElement userProfileIcon = driver.findElement(By.xpath("//a[@class='link']//span[@class='icon ic ic-user']"));
        actions.moveToElement(userProfileIcon).build().perform();

        //Step 2: Click on Login page link on the pop-up menu
        waitLoginBtn.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[@title='Ielogoties']")));
        WebElement loginPageBtn = driver.findElement(By.xpath("//a[@title='Ielogoties']"));
        loginPageBtn.click();

        //Step 3: Enter username
        waitLoginField.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@name='login[username]']")));
        WebElement loginField = driver.findElement(By.xpath("//input[@name='login[username]']"));
        loginField.sendKeys(username);

        //Step 4: Enter password
        WebElement passwordField = driver.findElement(By.xpath("//input[@name='login[password]']"));
        passwordField.sendKeys(password);

        //Step 5: Click login button
        WebElement loginBtn = driver.findElement(By.id("send2"));
        loginBtn.click();

        //Step 6: Scroll down to the copyright text in the footer
        WebElement footerCopyrightText = driver.findElement(By.xpath("//div[@class='footer-copyright']"));
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].scrollIntoView();", footerCopyrightText);

        //sleep(5000); //uncomment sleep to see that scrolling down to copyright text in footer works properly
    }
        @AfterMethod
        public void tearDown() {
            driver.quit();
        }
}
