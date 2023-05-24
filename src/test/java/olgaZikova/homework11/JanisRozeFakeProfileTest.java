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

public class JanisRozeFakeProfileTest {
    WebDriver driver;
    WebDriverWait wait;

    @BeforeTest
    public void setUP () {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        wait = new WebDriverWait(driver, Duration.ofSeconds(5));

        driver.get("https://www.janisroze.lv/");
    }
    @Test
    public void loginTest (){

        WebElement userIcon = driver.findElement(By.xpath("//*[@id=\"header-account\"]/ul/li/a/span[1]"));

        Actions actions = new Actions(driver);

        actions.moveToElement(userIcon).build().perform();

        WebElement lietotajaKontsDropDown = driver.findElement(By.xpath("//a[@title='Ielogoties']"));
        lietotajaKontsDropDown.click();

        wait.until(ExpectedConditions.urlContains("https://www.janisroze.lv/lv/customer/account/login/"));

        WebElement emailField = driver.findElement(By.id("email"));
        emailField.sendKeys("abc@abc.lv");

        WebElement pswdField = driver.findElement(By.id("pass"));
        pswdField.sendKeys("1234567");

        WebElement ielogotiesBtn = driver.findElement(By.id("send2"));
        ielogotiesBtn.click();


    }
    @AfterTest
    public void completeTest () {
        driver.quit();
    }
}

