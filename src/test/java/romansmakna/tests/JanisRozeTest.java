import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class JanisRozeTest {
    private WebDriver driver;

    @BeforeClass
    public void setUp() {
        System.setProperty("webdriver.chrome.driver", "path/to/chromedriver");
        driver = new ChromeDriver();
    }

    @Test
    public void createTestProfile() throws InterruptedException {
        // Step 1: Go to https://www.janisroze.lv/
        driver.get("https://www.janisroze.lv/");

        // Step 2: Hover mouse on «Lietotāja profils» icon
        WebElement lietotajaProfilsIcon = driver.findElement(By.className("user-profile-icon"));
        Actions action = new Actions(driver);
        action.moveToElement(lietotajaProfilsIcon).perform();

        // Step 3: Click on «Ielogoties»
        WebElement ielogotiesLink = driver.findElement(By.linkText("Ielogoties"));
        ielogotiesLink.click();

        // Step 4: Wait for Login page to appear
        Thread.sleep(2000); // Just for demonstration purposes, use appropriate wait

        // Step 5: Fill user credentials & log in
        WebElement usernameField = driver.findElement(By.id("username"));
        WebElement passwordField = driver.findElement(By.id("password"));
        WebElement loginButton = driver.findElement(By.id("login-button"));

        usernameField.sendKeys("your_username");
        passwordField.sendKeys("your_password");
        loginButton.click();

        // Step 6 (Optional): Scroll down until you see the footer
        JavascriptExecutor jsExecutor = (JavascriptExecutor) driver;
        WebElement footerElement = driver.findElement(By.cssSelector("footer"));
        jsExecutor.executeScript("arguments[0].scrollIntoView(true);", footerElement);
        Thread.sleep(1000); // Wait for scrolling animation to complete, if any
    }

    @AfterClass
    public void tearDown() {
        driver.quit();
    }
}
