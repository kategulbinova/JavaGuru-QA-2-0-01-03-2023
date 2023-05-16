package irinav.classwork.tests;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class MouseHoverRoseTest {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));

        driver.get("https://www.janisroze.lv/");

        WebElement userIcon = driver.findElement(By.xpath("//ul[@class='account-dropdown long']"));
        Actions actions = new Actions(driver);
        actions.moveToElement(userIcon).build().perform();

        WebElement loginBtn = driver.findElement(By.id("header-account"));
        wait.until(ExpectedConditions.elementToBeClickable(loginBtn));
        loginBtn.click();

        WebElement emailField = driver.findElement(By.id("email"));
        emailField.sendKeys("jane.brown@inbox.lv");

        WebElement passwordField = driver.findElement(By.id("pass"));
        passwordField.sendKeys("BookTest23#");

        WebElement submitField = driver.findElement(By.id("send2"));
        submitField.click();

        WebElement findFooter = driver.findElement(By.xpath("//div[@class='footer-copyright']"));
        JavascriptExecutor js = (JavascriptExecutor)driver;
        js.executeScript("window.scrollBy(0,800)", findFooter);

        driver.quit();
    }
}
