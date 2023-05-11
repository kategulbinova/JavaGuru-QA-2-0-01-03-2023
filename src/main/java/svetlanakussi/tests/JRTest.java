package svetlanakussi.tests;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class JRTest {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        driver.get("https://www.janisroze.lv");

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

        WebElement loginButton = driver.findElement(By.className("button"));
        loginButton.click();

        driver.quit();

    }
}
