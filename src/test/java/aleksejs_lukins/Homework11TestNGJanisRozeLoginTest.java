package aleksejs_lukins;
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

public class Homework11TestNGJanisRozeLoginTest {

    WebDriver driver;
    WebDriverWait waitForLoginButton;
    WebDriverWait waitForLoginField;

    @BeforeMethod
    public void setUp() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();

        waitForLoginButton = new WebDriverWait(driver, Duration.ofSeconds(1));
        waitForLoginField = new WebDriverWait(driver, Duration.ofSeconds(2));

        driver.get("https://www.janisroze.lv/");
    }

    @Test
    public void JanisRozeTest() {
        Actions actions = new Actions(driver);
        String loginName = "aleksejslukins@gmail.com";
        String password = "javaguru";

        driver.manage().window().maximize();

        WebElement userProfileIcon = driver.findElement(By.xpath("//*[@id='header-account']/ul/li/a/span[1]"));
        actions.moveToElement(userProfileIcon).build().perform();

        waitForLoginButton.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[@title='Ielogoties']")));
        WebElement loginPageBtn = driver.findElement(By.xpath("//a[@title='Ielogoties']"));
        loginPageBtn.click();

        waitForLoginField.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@name='login[username]']")));
        WebElement loginField = driver.findElement(By.xpath("//input[@name='login[username]']"));
        loginField.sendKeys(loginName);

        WebElement passwordField = driver.findElement(By.xpath("//input[@name='login[password]']"));
        passwordField.sendKeys(password);

        WebElement clickLogin = driver.findElement(By.id("send2"));
        clickLogin.click();

    }
    @AfterMethod
    public void quitDriver() {
        driver.quit();
    }

}