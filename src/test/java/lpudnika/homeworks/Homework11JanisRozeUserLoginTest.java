package lpudnika.homeworks;

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

public class Homework11JanisRozeUserLoginTest {

    WebDriver driver;

    WebDriverWait wait;

    @BeforeMethod
    public void setUp() {

        driver = new ChromeDriver();
        WebDriverManager.chromedriver().setup();

        wait = new WebDriverWait(driver, Duration.ofSeconds(25));

        driver.get("https://www.janisroze.lv/");

    }

    @Test
    public void janisRozeLoginTest(){

        WebElement lietotajaProfilsIcon = driver.findElement(By.xpath("//ul[@class='account-dropdown long']"));

        Actions actions = new Actions(driver);
        actions.moveToElement(lietotajaProfilsIcon).build().perform();

        //finding ielogoties button
        WebElement ielogotiesLink = driver.findElement(By.id("header-account"));
        wait.until(ExpectedConditions.elementToBeClickable(ielogotiesLink));
        ielogotiesLink.click();

        //finding email field
        WebElement epastaAdreseField = driver.findElement(By.id("email"));
        epastaAdreseField.sendKeys("qatest.lpo2@gmail.com");

        //finding password field
        WebElement paroleField = driver.findElement(By.id("pass"));
        paroleField.sendKeys("zaq1xsw2");

        WebElement ielogotiesButton = driver.findElement(By.id("send2"));
        ielogotiesButton.click();

        if (driver.getCurrentUrl().contains("customer/account/")) {
            System.out.println("Login successful!");
        } else {
            System.out.println("Login failed: invalid username or password.");
        }

    }

    @Test
    public void optionalTaskJsScrollTillCopyrightTest(){

        //finding copyright field in footer
        WebElement footerCopyright = driver.findElement(By.xpath("//div[@class='footer-copyright']"));

        //scrolling down the page till Copyright
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].scrollIntoView();", footerCopyright);

        String copyrightText = driver.findElement(By.xpath("//div[@class='footer-copyright']")).getText();
        if (copyrightText.contains("2016")) {
            System.out.println("Page successfully scrolled down!");
        } else {
            System.out.println("Page is not scrolled down.");
        }
    }

    @AfterMethod
    public void tearDown() {
        driver.quit();
    }
}
