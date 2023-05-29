package margo.homeWork;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import java.time.Duration;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class Lect11JaRoLoginTest {
    @Test
    public void JanisRozeLoginTest() {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        Actions actions = new Actions(driver);
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(2));
        JavascriptExecutor jsExecutor = (JavascriptExecutor) driver;

        driver.get("https://www.janisroze.lv/");

        WebElement lietotajaProfIcon = driver.findElement(By.id("header-account"));
        actions.moveToElement(lietotajaProfIcon).build().perform();

        WebElement ielogotiesMenuItem = driver.findElement(By.xpath("//a[contains(@title,'Ielogoties')]"));
        ielogotiesMenuItem.click();

        wait.until(ExpectedConditions.urlContains("customer/account"));

        WebElement ePastaAdreseField = driver.findElement(By.id("email"));
        ePastaAdreseField.sendKeys("merame@inbox.lv");

        WebElement paroleField = driver.findElement(By.id("pass"));
        paroleField.sendKeys("v3rystr0ngpas");

        WebElement ielogotiesButton = driver.findElement(By.id("send2"));
        ielogotiesButton.click();

        WebElement footer = driver.findElement(By.xpath("//div[@class='footer-copyright']"));
        jsExecutor.executeScript("arguments[0].scrollIntoView();", footer);

        driver.quit();
    }
}
