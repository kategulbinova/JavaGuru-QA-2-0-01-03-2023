package olgaZikova.homework11;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.time.Duration;

import static java.lang.Thread.sleep;

public class JanisRozeFakeProfileTestNew {
    WebDriver driver;
    WebDriverWait wait;

    @BeforeTest
    public void setUP () {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));

        driver.get("https://www.janisroze.lv/");
    }
    @Test
    public void fakeLogin () throws InterruptedException {

        WebElement userIcon = driver.findElement(By.id("header-account"));
        sleep(2000);
        Actions actions = new Actions(driver);
        sleep(2000);
        actions.moveToElement(userIcon).build().perform();

        WebElement lietotajaKontsDropDown = driver.findElement(By.linkText("Ielogoties"));
        lietotajaKontsDropDown.click();
        ///wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("email")));

        WebElement emailField = driver.findElement(By.id("email"));
        emailField.sendKeys("abc@abc.lv");

        WebElement pswdField = driver.findElement(By.id("pass"));
        pswdField.sendKeys("12345");

        WebElement ielogotiesBtn = driver.findElement(By.id("send2"));
        ielogotiesBtn.click();


    }
    @AfterTest
    public void completeTest () {
        driver.quit();
    }
}

